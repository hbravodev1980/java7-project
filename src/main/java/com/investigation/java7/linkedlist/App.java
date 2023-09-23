package com.investigation.java7.linkedlist;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = addArrayList();
        LinkedList<Integer> numbers2 = addLinkedList();

        getElementArrayList(numbers1, 3500);
        getElementLinkedList(numbers2, 3500);
    }

    public static ArrayList<Integer> addArrayList() {
        long start = System.nanoTime();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10_000; i++) {
            numbers.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Time addArrayList in nanoseconds: " + (end - start));
        return numbers;
    }

    public static LinkedList<Integer> addLinkedList() {
        long start = System.nanoTime();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i < 10_000; i++) {
            numbers.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Time addLinkedList in nanoseconds: " + (end - start));
        return numbers;
    }

    public static void getElementArrayList(ArrayList<Integer> numbers, int index) {
        long start = System.nanoTime();
        numbers.get(index);
        long end = System.nanoTime();
        System.out.println("Time getElementArrayList in nanoseconds: " + (end - start));
    }

    public static void getElementLinkedList(LinkedList<Integer> numbers, int index) {
        long start = System.nanoTime();
        numbers.get(index);
        long end = System.nanoTime();
        System.out.println("Time getElementLinkedList in nanoseconds: " + (end - start));
    }
}