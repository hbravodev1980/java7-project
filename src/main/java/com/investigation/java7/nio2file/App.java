package com.investigation.java7.nio2file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class App {
    public static void main(String[] args) throws IOException {
        operateFileNio2("crear");
        operateFileNio2("exist");
        operateFileNio2("copy");
        operateFileNio2("move");
        operateFileNio2("delete");
    }

    public static void operateFileNio2(String operation) throws IOException {
        Path source = Paths.get("text-nio2-source.txt");
        Path destination = Paths.get("text-nio2-destination.txt");

        switch (operation) {
            case "crear":
                Files.createFile(source);
                break;
            case "exist":
                boolean exist = Files.exists(source, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
                System.out.println("Is exist: " + exist);
                break;
            case "copy":
                Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
                break;
            case "move":
                Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
                break;
            case "delete":
                Files.deleteIfExists(destination);
                break;
            default:
                System.out.println("No exist operation");
        }
    }
}