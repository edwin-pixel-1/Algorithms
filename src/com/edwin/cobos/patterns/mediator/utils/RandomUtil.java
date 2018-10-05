package com.edwin.cobos.patterns.mediator.utils;

import java.util.Random;

public class RandomUtil {

    public static int[] randomSerialNumberRange(int num, int min, int max) {
        Random random = new Random();
        return random.ints(num, min, max).sorted().toArray();
    }
}
