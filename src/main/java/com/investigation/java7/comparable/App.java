package com.investigation.java7.comparable;

import com.investigation.java7.common.User;
import com.investigation.java7.common.UserComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 2, 4, 9, 5, 20, 0);

        Collections.sort(integers);
        System.out.println(integers);

        Collections.reverse(integers);
        System.out.println(integers);

        // Se implementa la interfaz Comparator en UserComparator
        // y se sobreescribe el metodo compare
        List<User> users = Arrays.asList(
                new User(1, "Charles", 20),
                new User(2, "John", 18),
                new User(3, "Harry", 40),
                new User(4, "Bertha", 25));
        Collections.sort(users, new UserComparator());
        System.out.println(users);

        // Se implementa la interfaz Comparable en User
        // y se sobreescribe metodo compareTo
        Collections.sort(users);
        System.out.println(users);
    }
}
