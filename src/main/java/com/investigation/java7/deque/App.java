package com.investigation.java7.deque;

import com.investigation.java7.common.User;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Deque<String> fruits = getDequeFruits();
        System.out.println(fruits);
        System.out.println("Peek: " + fruits.peek());
        System.out.println("Pop: " + fruits.pop());
        System.out.println("Poll: " + fruits.poll());
        fruits.addFirst("orange");
        fruits.addLast("strawberry");
        System.out.println(fruits);

        Deque<User> users = getDequeUsers();
        System.out.println(users);
        System.out.println("Peek: " + users.peek());
        System.out.println("Pop: " + users.pop());
        System.out.println("Poll: " + users.poll());
        users.addFirst(new User(7, "Donald", 67));
        users.addLast(new User(8, "Simon", 70));
        System.out.println(users);
    }

    public static Deque<User> getDequeUsers() {
        Deque<User> users = new ArrayDeque<>();
        users.add(new User(1, "Harry", 43));
        users.add(new User(2, "Lisa", 21));
        users.add(new User(3, "Peter", 32));
        users.add(new User(4, "Robert", 36));
        users.add(new User(5, "John", 18));
        users.add(new User(6, "Louise", 19));
        return users;
    }

    public static Deque<String> getDequeFruits() {
        Deque<String> fruits = new ArrayDeque<>();
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("banana");
        return fruits;
    }
}