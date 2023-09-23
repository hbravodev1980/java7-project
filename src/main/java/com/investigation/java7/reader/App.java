package com.investigation.java7.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class App {
    public static void main(String[] args) {
        readFileReader();
        writeFileWriter();
        readBufferedReader();
        writeBufferedWriter();
    }

    public static void readFileReader() {
        try (Reader fr = new FileReader("origen.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeFileWriter() {
        try (Writer fw = new FileWriter("destino.txt", true)) {
            fw.write("Suscribete al canal de Peter");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readBufferedReader() {
        int bufferSize = 1024;
        try (Reader fr = new FileReader("origen.txt");
             Reader br = new BufferedReader(fr, bufferSize)) {
            int data;
            while ((data = br.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeBufferedWriter() {
        int bufferSize = 1024;
        try (Writer fw = new FileWriter("destino.txt");
             Writer bw = new BufferedWriter(fw, bufferSize)) {
            bw.write("Suscribanse a mi canal");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
