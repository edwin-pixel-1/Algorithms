package com.exercises;

public class RemoveDuplicates {

    public RemoveDuplicates(){
        char[] arrayStr = "aaaa".toCharArray();
        String result = removeDuplicates_2(arrayStr);
        System.out.println("Result: " + result);
    }

    private void removeDuplicates(char[] str) {
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;

        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
    }

    private void removeDuplicates_1(char[] str) {
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;
        boolean[] hit = new boolean[256];
        for (int i = 0; i < 256; ++i) {
            hit[i] = false;
        }
        hit[str[0]] = true;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            if (!hit[str[i]]) {
                str[tail] = str[i];
                ++tail;
                hit[str[i]] = true;
            }
        }
        str[tail] = '\0';
    }

    private String removeDuplicates_2(char[] str) {
        boolean check[] = new boolean[256];
        int index = 0;
        for (char tmp : str) {
            if (!check[tmp]) {
                str[index] = tmp;
                check[tmp] = true;
            } else {
                str[index] = 0;
            }
            index++;
        }
        return new String(str, 0, str.length);
    }

}
