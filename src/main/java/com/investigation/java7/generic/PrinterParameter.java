package com.investigation.java7.generic;

import com.investigation.java7.common.Animal;

import java.util.List;

public class PrinterParameter<T> {
    public void printWithParameter(T object1) {
        System.out.println("Print with parameter");
        System.out.println(object1);
    }

    public T returnWithParameter(T object1) {
        System.out.println("Return with parameter");
        return object1;
    }

    public static <T> void printWithParameterStatic(T object1) {
        System.out.println("Print with parameter static");
        System.out.println(object1);
    }

    public static <T> T returnWithParameterStatic(T object1) {
        System.out.println("Return with parameter static");
        return object1;
    }

    // Wildcard unbounded List<?>
    // Wildcard upper bounded List<? extends Animal>
    // Wildcard lower bounded List<? super Dog>
    public static void printList(List<? extends Animal> myList) {
        System.out.println("Size of list: " + myList.size());
    }
}