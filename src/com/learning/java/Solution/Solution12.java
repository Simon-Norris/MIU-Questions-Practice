package com.learning.java.Solution;

public class Solution12 {

    public static int isSumSafe(int[] a) {
        if (a == null || a.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) return 0;
        }
        return 1;
    }
}
