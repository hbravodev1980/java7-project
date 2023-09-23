package com.investigation.java7.generic;

public class Printer<T> {
    private T object1;

    public Printer(T object1) {
        this.object1 = object1;
    }

    public void print() {
        System.out.println(object1 + " is " + object1.getClass());
    }
}