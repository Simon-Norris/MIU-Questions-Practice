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

    public static int factorEqual(int n, int m) {
        if( n < 0 || m < 0) return 0;
        int countN = 0;
        int countM = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) countN++;
        }
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) countM++;
        }

        if (countM == countN) return 1;
        return 0;
    }

    public static int isMeera(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= i) return 0;
            sum += arr[i];
        }
        if ( sum != 0) return 0;
        return 1;
    }

    public static int isTriple(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int constant = 3, count = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (value == arr[j]) count++;
            }

            if (constant != count) return 0;
            count = 0;
        }
        return 1;
    }
}
