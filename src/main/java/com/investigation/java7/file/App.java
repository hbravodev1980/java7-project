package com.investigation.java7.file;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println("File created: " + file.createNewFile());
        System.out.println("File exist: " + file.exists());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is file deleted: " + file.delete());

        File directory = new File("directory");
        System.out.println("Directory created: " + directory.mkdir());
        System.out.println("Directory exist: " + directory.exists());
        System.out.println("Is directory: " + directory.isDirectory());
        System.out.println("Is directory deleted: " + directory.delete());
    }
}