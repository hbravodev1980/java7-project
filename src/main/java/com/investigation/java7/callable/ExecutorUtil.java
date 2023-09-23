package com.investigation.java7.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorUtil {
    public static void runExecutor() throws ExecutionException, InterruptedException {
        Callable<String> callable1 = new ThreadCallable("ThreadCallable1", 6000);
        Callable<String> callable2 = new ThreadCallable("ThreadCallable2", 2000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<String>> futures = new ArrayList<>();
        futures.add(executorService.submit(callable1));
        futures.add(executorService.submit(callable2));

        for (Future<String> future: futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }

    public static void runExecutorCompletion() throws ExecutionException, InterruptedException {
        Callable<String> callable1 = new ThreadCallable("ThreadCallable1", 6000);
        Callable<String> callable2 = new ThreadCallable("ThreadCallable2", 2000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorCompletionService<String> executorCompletionService = new ExecutorCompletionService<>(executorService);

        List<Future<String>> futures = new ArrayList<>();
        futures.add(executorCompletionService.submit(callable1));
        futures.add(executorCompletionService.submit(callable2));

        for (int i = 0; i < futures.size(); i++) {
            System.out.println(executorCompletionService.take().get());
        }
        executorService.shutdown();
    }
}