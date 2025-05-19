package com.tnsif.Intro;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
       
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); 
        System.out.println("List (fruits): " + fruits);

        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // duplicate ignored
        System.out.println("Set (uniqueFruits): " + uniqueFruits);

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 60);
        fruitPrices.put("Apple", 120); 
        System.out.println("Map (fruitPrices): " + fruitPrices);

        System.out.println("\nIterating List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating Set:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating Map:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
