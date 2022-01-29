package com.edwin.cobos.Maharishi.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab1 {

    public List<String> knapsack(String[] items, int[] v, int[] w, int weight) {
        int n = items.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        List<List<Integer>> combinations = powerSet(new ArrayList<>(Arrays.asList(indices)));

        List<Integer> finalSubset = null;
        int weightFinalCount = 0;
        for (int i = combinations.size() - 1; i >= 0; i--) {
            List<Integer> subset = combinations.get(i);
            int weightCount = 0;
            for (Integer subIndex : subset) {
                weightCount += w[subIndex];
            }
            if (weightCount <= weight && weightCount > weightFinalCount) {
                weightFinalCount = weightCount;
                finalSubset = subset;
            }
        }

        if (finalSubset != null) {
            return finalSubset.stream().map(x -> items[x]).collect(Collectors.toList());
        }

        return null;
    }

    public List<List<Integer>> powerSet(List<Integer> originalSet) {
        int resultSize = (int) Math.pow(2, originalSet.size());
        List<List<Integer>> resultPowerSet = new ArrayList<>(resultSize);
        resultPowerSet.add(new ArrayList<>(0));
        for (Integer itemFromOriginalSet : originalSet) {
            int startingResultSize = resultPowerSet.size();
            for (int i = 0; i < startingResultSize; i++) {
                List<Integer> oldSubset = resultPowerSet.get(i);
                List<Integer> newSubset = new ArrayList<>(oldSubset);
                newSubset.add(itemFromOriginalSet);
                resultPowerSet.add(newSubset);
            }
        }
        return resultPowerSet;
    }

    public static void main(String[] args) {
        Lab1 kb = new Lab1();
        String[] items = {"A", "B", "C"};
        int[] v = {100, 60, 120};
        int[] w = {20, 10, 30};
        int W = 50;
        System.out.println(kb.knapsack(items, w, v, W));
    }

}
