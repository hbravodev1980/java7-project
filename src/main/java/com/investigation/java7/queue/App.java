package com.investigation.java7.queue;

import com.investigation.java7.common.User;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> fruits = getQueueFruits();
        System.out.println(fruits);
        printElementToAttend(fruits);
        attend(fruits);

        Queue<User> users = getQueueUsers();
        System.out.println(users);
        printElementToAttend(users);
        attend(users);
    }

    public static Queue<User> getQueueUsers() {
        Queue<User> users = new PriorityQueue<>();
        users.offer(new User(1, "Harry", 43));
        users.offer(new User(2, "Lisa", 21));
        users.offer(new User(3, "Peter", 32));
        users.offer(new User(4, "Robert", 36));
        users.offer(new User(5, "John", 18));
        users.offer(new User(6, "Louise", 19));
        return users;
    }

    public static Queue<String> getQueueFruits() {
        Queue<String> fruits = new PriorityQueue<>();
        fruits.offer("pear");
        fruits.offer("apple");
        fruits.offer("mango");
        fruits.offer("pineapple");
        fruits.offer("banana");
        return fruits;
    }

    public static void printElementToAttend(Queue<?> queue) {
        // Obtiene el primer elemento priorizado
        System.out.println(queue.peek());
    }

    public static void attend(Queue<?> queue) throws InterruptedException {
        while (!queue.isEmpty()) {
            // Empieza a atender cada elemento priorizandolo por orden
            System.out.println("Attending: " + queue.poll());
            Thread.sleep(1000);
        }
    }
}