package com.edwin.cobos.Maharishi;

public class Exercise5 {

    public Exercise5() {
        int count = primeCount(2, 1);
        System.out.println(count);
    }

    private int primeCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if(i > 1) {
                boolean isPrime = true;
                for (int k = 2; k < i; k++) {
                    if (i % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    count++;
            }
        }

        return count;
    }
}
