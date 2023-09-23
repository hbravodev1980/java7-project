package com.investigation.java7.outputstream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {
    public static void main(String[] args) {
        writeFileOutputStream();
        writeFileBufferedOutputStream();
    }

    public static void writeFileOutputStream() {
        long start = System.nanoTime();
        try (InputStream fis = new FileInputStream("origen.txt");
             OutputStream fos = new FileOutputStream("destino.txt")) {
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, byteRead);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("Time FileOuputStream: " + (end - start));
    }

    public static void writeFileBufferedOutputStream() {
        long start = System.nanoTime();
        int bufferSize = 1024;
        try (InputStream fis = new FileInputStream("origen.txt");
             OutputStream fos = new FileOutputStream("destino-buffered.txt");
             OutputStream bos = new BufferedOutputStream(fos, bufferSize)) {
            byte[] buffer = new byte[bufferSize];
            int byteRead;
            while ((byteRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, byteRead);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("Time BufferedOuputStream: " + (end - start));
    }
}
