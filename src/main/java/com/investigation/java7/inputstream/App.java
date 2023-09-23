package com.investigation.java7.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {

    public static void main(String[] args) {
        readFileByteToByteFileInputStream();
        readFileBlockBytesFileInputStream();
        readFileBufferedInputStream();
    }

    public static void readFileByteToByteFileInputStream() {
        long start = System.nanoTime();
        try (InputStream fis = new FileInputStream("test.txt")) {
            // lee byte a byte
            int i;
            while ((i = fis.read()) != -1) {
                //System.out.println(i + " - " + (char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("Time byte to byte: " + (end - start));
    }

    public static void readFileBlockBytesFileInputStream() {
        long start = System.nanoTime();
        try (InputStream fis = new FileInputStream("test.txt")) {
            byte[] array = new byte[1024];
            // lee bytes en bloque
            int i;
            while ((i = fis.read(array)) != -1) {
                //System.out.println("bytes leidos " + i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("Time in block of bytes: " + (end - start));
    }

    public static void readFileBufferedInputStream() {
        long start = System.nanoTime();
        try (InputStream fis = new FileInputStream("test.txt");
             InputStream bis = new BufferedInputStream(fis, 1024)) {
            int i;
            while ((i = bis.read()) != -1) {
                //System.out.println("bytes leidos " + i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("Time in buffered input stream: " + (end - start));
    }
}
