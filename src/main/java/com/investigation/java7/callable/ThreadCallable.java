package com.investigation.java7.callable;

import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<String> {
    private String name;
    private int seconds;

    public ThreadCallable(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(seconds);
        return name;
    }
}