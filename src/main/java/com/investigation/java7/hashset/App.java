package com.investigation.java7.hashset;

import com.investigation.java7.common.User;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // Se crea una lista desordenada que no acepta duplicados
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Pears");
        System.out.println(fruits);

        // La clase User debe sobreescribir solo el metodo equals y hashcode
        Set<User> users = new HashSet<>();
        users.add(new User(1, "Harry", 43));
        users.add(new User(2, "Lisa", 32));
        users.add(new User(3, "Peter", 29));
        users.add(new User(4, "Charles", 50));
        users.add(new User(3, "Peter", 29));
        System.out.println(users);
    }
}