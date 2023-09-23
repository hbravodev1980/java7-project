package com.investigation.java7.catchlineal;

public class App {
    public static void main(String[] args) {
        try {
            Integer.parseInt("a");
        } catch (NullPointerException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
