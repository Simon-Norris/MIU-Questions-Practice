package com.learning.java.Solution;

public class Solution6 {

    public static int isComplete (int[ ] a){
        if (a == null || a.length == 0) return 0;

        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <=  0) return 0;
            if (a[i] % 2 == 0 && a[i] > maxEven) maxEven = a[i];
        }

        for (int i = 2; i < maxEven; i+=2) {
            boolean isInArray = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) return 0;
        }
        return 1;
    }
}
