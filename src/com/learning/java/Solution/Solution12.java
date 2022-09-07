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

    public static int isStacked(int n) {
        int sum = 0;
        int i =1;
        while (sum <= n) {
            sum += i;
            if (sum == n) return 1;
            if (sum > n) break;
            i++;

        }
        return 0;
    }
}
