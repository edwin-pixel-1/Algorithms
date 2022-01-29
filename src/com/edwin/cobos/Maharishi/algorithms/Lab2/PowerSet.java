package com.edwin.cobos.Maharishi.algorithms.Lab2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class PowerSet {

    private List<Set<String>> powerSet(List<String> X) {
        List<Set<String>> P = new ArrayList<>();
        Set<String> S = new HashSet<>();
        P.add(S);
        while (!X.isEmpty()) {
            String f = X.remove(0);
            Set<String> T = ConcurrentHashMap.newKeySet();
            for (Set<String> x : P) {
                T.addAll(x);
                T.add(f);
            }
            P.add(T);
        }
        return P;
    }

    public static void main(String[] args) {
        PowerSet prob = new PowerSet();
        List<String> items = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<Set<String>> result = prob.powerSet(items);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
