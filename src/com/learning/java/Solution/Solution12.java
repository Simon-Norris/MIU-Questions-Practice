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

    public static int isVanilla(int[] a) {
        if ( a ==null ||  a.length == 0) return 1;
        int prev = a[0] % 10;
        for (int i = 0; i < a.length; i++) {
            int num = Math.abs(a[i]);
            while (num != 0) {
                int rem = num % 10;
                if (prev != rem) return 0;
                num = num / 10;
            }
        }
        return 1;
    }

    public static int isIsolated(long n) {
        long validator = 2097151;
        if ( n < 1 || n > validator) return -1;
        long square = n*n;
        long cube = n*n*n;

        while (cube != 0) {
            long rem = cube % 10;
            long num = square;
            while (num != 0) {
                long sqRem = num % 10;
                if (rem == sqRem) return 0;
                num /= 10;
            }
            cube /= 10;
        }
        return 1;
    }

    public static int isTriValent(int[] a) {
        if ( a == null || a.length < 3) return 0;

        int first = a[0];
        int sec = first;
        int third = first;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != first) sec = a[i];break;
        }
        if (first == sec) return 0;
        for (int i = 2; i < a.length; i++) {
            if (a[i] != first) {
                if (a[i] != sec) {
                    third = a[i];
                    break;
                }
            }
        }
        if (first == third || sec == third) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != first ){
                if ( a[i] != sec) {
                    if ( a[i] != third) return 0;
                }
            }
        }
        return 1;
    }
}
