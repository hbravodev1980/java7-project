package com.investigation.java7.nio2readwritefile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        readFileWithNio2();
        writeFileWithNio2();
        readFileChannelWithNio2();
        writeFileChannelWithNio2();
    }

    public static void readFileWithNio2() throws IOException {
        Path path = Paths.get("file-read.txt");
        byte[] bytes = Files.readAllBytes(path);
        for (byte b: bytes) {
            System.out.println((char) b);
        }
    }

    public static void writeFileWithNio2() throws IOException {
        Path path = Paths.get("file-write.txt");
        String text = "Escribiendo nuevo texto";
        Files.write(path, text.getBytes(StandardCharsets.UTF_8));
    }

    public static void readFileChannelWithNio2() throws IOException {
        RandomAccessFile file = new RandomAccessFile("file-read.txt", "rw");
        FileChannel channel = file.getChannel();

        long size = channel.size();
        ByteBuffer buffer = ByteBuffer.allocate((int) size);

        int bytesRead;
        while ((bytesRead = channel.read(buffer)) != -1) {
            System.out.println("Leidos: " + bytesRead);

            buffer.flip(); // Preparando el buffer a modo de lectura
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            buffer.clear(); // Preparando el buffer a modo escritura
        }
        file.close();
    }

    public static void writeFileChannelWithNio2() throws IOException {
        RandomAccessFile file = new RandomAccessFile("file-write.txt", "rw");
        FileChannel channel = file.getChannel();

        String text = "Suscribanse a mi canal pronto";
        ByteBuffer buffer = ByteBuffer.allocate(128);

        buffer.clear(); // Preparando el buffer a modo escritura
        buffer.put(text.getBytes(StandardCharsets.UTF_8));
        buffer.flip(); // Preparando el buffer a modo de lectura

        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }
        file.close();
    }
}