package com.learning.java.Solution;

public class Solution5 {
    private static int isPrime(int num) {
        if (num < 2) return 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }

    public static int countDigit(int n, int digit) {
        if (n < 0 || digit < 0) return 0;
        int count = 0;
        while (n != 0) {
            if (n%10 == digit) count++;
            n /= 10;
        }
        return count;
    }

    public static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
           if (a[i] % 2 != 0) {
               if (isPrime(a[i+1]) == 1) return 1;
           }
        }
        return 0;
    }
}
