package com.investigation.java7.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;

import java.nio.file.WatchEvent;

import static java.nio.file.StandardWatchEventKinds.OVERFLOW;
import static java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();

        Path directory = Paths.get("my-directory");
        directory.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

        System.out.println("Starting observation for: " + directory.getFileName());

        while (true) {
            WatchKey watchKey = watchService.take();
            List<WatchEvent<?>> watchEvents = watchKey.pollEvents();

            for (WatchEvent<?> watchEvent: watchEvents) {
                Kind<?> kind = watchEvent.kind();
                Path fileName = (Path) watchEvent.context();
                System.out.println(kind.name() + " - " + fileName.toString());

                if (kind == OVERFLOW) {
                    continue;
                }
            }
            boolean isReset = watchKey.reset();
            if (!isReset) {
                break;
            }
        }
    }
}