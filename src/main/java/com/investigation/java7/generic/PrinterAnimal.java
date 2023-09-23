package com.investigation.java7.generic;

import com.investigation.java7.common.Animal;

public class PrinterAnimal<T extends Animal> {
    private T object;

    public PrinterAnimal(T object) {
        this.object = object;
    }

    public void print() {
        object.eat();
    }
}