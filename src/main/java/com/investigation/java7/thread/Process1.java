package com.investigation.java7.thread;

public class Process1 implements Runnable {
    private String name;

    public Process1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + this.name + " - " + i);
        }
    }
}