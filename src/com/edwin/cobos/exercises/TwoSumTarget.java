package com.edwin.cobos.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

    public TwoSumTarget(){
        int[] result = twoSum_2(new int[]{2, 11, 11, 15, 7}, 18);
        System.out.println("Result: " + Arrays.toString(result));
    }

    /***
     * https://leetcode.com/problems/two-sum/description/
     */
    public int[] twoSum_2(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                return new int[]{map.get(tmp), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
