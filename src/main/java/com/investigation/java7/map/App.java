package com.investigation.java7.map;

import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> names1 = addHashMap();
        printElements(names1);

        TreeMap<String, String> names2 = addTreeMap();
        printElements(names2);

        LinkedHashMap<String, String> names3 = addLinkedHashMap();
        printElementsWithFor(names3);
    }

    public static HashMap<String, String> addHashMap() {
        // Acepta nulos en key y value
        // Se ordena por key
        HashMap<String, String> names = new HashMap<>();
        names.put("3", "Laura");
        names.put("4", "Peter");
        names.put("1", "Harry");
        names.put("2", "Charles");
        names.put("5", null);
        names.put(null, "Marcus");
        names.put("4", "Lisa");
        return names;
    }

    public static TreeMap<String, String> addTreeMap() {
        // Acepta nulos en value
        // Se ordena por key
        TreeMap<String, String> names = new TreeMap<>();
        names.put("3", "Laura");
        names.put("4", "Peter");
        names.put("1", "Harry");
        names.put("2", "Charles");
        names.put("5", null);
        names.put("4", "Lisa");
        return names;
    }

    public static LinkedHashMap<String, String> addLinkedHashMap() {
        // Acepta nulos en key y value
        // Respeta el orden de ingreso
        LinkedHashMap<String, String> names = new LinkedHashMap<>();
        names.put("3", "Laura");
        names.put("4", "Peter");
        names.put("1", "Harry");
        names.put("2", "Charles");
        names.put("5", null);
        names.put(null, "Alex");
        names.put("4", "Lisa");
        return names;
    }

    public static void printElements(Map<String, String> names) {
        System.out.println("Print " + names.getClass());
        Iterator<String> iterator = names.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + names.get(key));
        }
    }

    public static void printElementsWithFor(Map<String, String> names) {
        System.out.println("Print " + names.getClass());
        for (Map.Entry<String, String> entry: names.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
