package com.investigation.java7.thread;

public class Process2 implements Runnable {
    private String name;

    public Process2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + this.name + " - " + i);
        }
    }
}