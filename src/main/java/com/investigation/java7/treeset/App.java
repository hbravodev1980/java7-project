package com.investigation.java7.treeset;

import com.investigation.java7.common.User;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // Se crea una lista ordenada que no acepta duplicados
        Set<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Pears");
        System.out.println(fruits);

        // La clase User debe sobreescribir el metodo equals y hashcode
        // Asimismo, se debe implementar la interfaz Comparable
        // y sobreescribir el metodo compareTo
        Set<User> users = new TreeSet<>();
        users.add(new User(1, "Harry", 43));
        users.add(new User(2, "Lisa", 32));
        users.add(new User(3, "Peter", 29));
        users.add(new User(4, "Charles", 50));
        users.add(new User(3, "Peter", 29));
        System.out.println(users);
    }
}