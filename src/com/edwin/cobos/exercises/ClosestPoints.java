package com.edwin.cobos.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class ClosestPoints {
    public ClosestPoints() {
        List<int[]> list = Arrays.asList(
                new int[]{1, 0},
                new int[]{0, 5},
                new int[]{3, 0},
                new int[]{1, 0},
                new int[]{10, 10},
                new int[]{15, 9},
                new int[]{2, 0},
                new int[]{1, 3},
                new int[]{3, 1},
                new int[]{5, 1}
        );

        List<int[]> result =closestPoints(list, 2);
        System.out.println("Result: " + Arrays.deepToString(result.toArray()));
    }

    private List<int[]> closestPoints(List<int[]> points, int k) {
        Map<Double, int[]> result = new TreeMap<>();

        if (k <= 0 || points.size() == 0) return new ArrayList<>();

        for (int[] point : points) {
            double distance = Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));

            result.put(distance, point);
        }

        return result
                .values()
                .stream()
                .limit(k)
                .collect(Collectors.toList());
    }
}
