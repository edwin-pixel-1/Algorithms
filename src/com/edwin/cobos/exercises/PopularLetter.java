package com.edwin.cobos.exercises;

import java.util.HashMap;

public class PopularLetter {

    public PopularLetter() {
        char result = getMostPopularLetter("Hello app");
        System.out.println("Result: " + result);
    }

    private char getMostPopularLetter(String input) {
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
