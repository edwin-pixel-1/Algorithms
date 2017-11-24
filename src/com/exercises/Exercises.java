package com.exercises;

import java.util.HashMap;

public class Exercises {

    public Exercises() {
        double startMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024d / 1024d;
        char result = getMostPopularLetter("Hello app");
        double endMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024d / 1024d;
        double resultMemory = endMemory - startMemory;
        System.out.println("Memory: " + resultMemory);
        System.out.println("MostPopularLetter: " + result);
    }

    public char getMostPopularLetter(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character result = null;

        for (char c : input.toCharArray()) {
            map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);

            if (result == null) {
                result = c;
            } else if (map.get(result) <= map.get(c)) {
                result = c;
            }
        }

        return result;
    }
}
