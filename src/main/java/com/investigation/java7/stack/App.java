package com.investigation.java7.stack;

import com.investigation.java7.common.User;

import java.util.Stack;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Acepta duplicados y respeta el orden de ingreso
        Stack<String> fruits = getStackFruits();
        System.out.println(fruits);
        printElementToAttend(fruits);
        searchOrderToAttend(fruits, "apple");
        attend(fruits);

        // Acepta duplicados y respeta el orden de ingreso
        // Requiere del metodo equals y hashcode para buscar el orden de atencion
        Stack<User> users = getStackUsers();
        System.out.println(users);
        printElementToAttend(users);
        searchOrderToAttend(users, new User(4, "Robert", 36));
        attend(users);
    }

    public static Stack<User> getStackUsers() {
        Stack<User> users = new Stack<>();
        users.push(new User(1, "Harry", 43));
        users.push(new User(2, "Lisa", 21));
        users.push(new User(3, "Peter", 32));
        users.push(new User(4, "Robert", 36));
        users.push(new User(5, "John", 18));
        users.push(new User(6, "Louise", 19));
        return users;
    }

    public static Stack<String> getStackFruits() {
        Stack<String> fruits = new Stack<>();
        fruits.push("pear");
        fruits.push("apple");
        fruits.push("mango");
        fruits.push("pineapple");
        fruits.push("banana");
        fruits.push("mango");
        return fruits;
    }

    public static void printElementToAttend(Stack<?> stacks) {
        // Obtiene el ultimo elemento pero no lo elimina de la pila
        System.out.println(stacks.peek());
    }

    public static void searchOrderToAttend(Stack<?> stacks, Object element) {
        System.out.println(stacks.search(element));
    }

    public static void attend(Stack<?> stacks) throws InterruptedException {
        while (!stacks.isEmpty()) {
            // Obtiene el ultimo elemento y lo elimina de la pila
            System.out.println("Attending: " + stacks.pop());
            Thread.sleep(1000);
        }
    }
}