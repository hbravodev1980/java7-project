package com.investigation.java7.callable;

import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorUtil.runExecutor();
        //ExecutorUtil.runExecutorCompletion();
    }
}