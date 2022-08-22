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

    public static int isMeera(int[] a){
        if (a == null || a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            int doubleNumber = 2 * a[i];
            for (int j = 0; j < a.length; j++) {
                if (a[j] == doubleNumber) return 0;
            }
        }
        return 1;
    }

    public static int isMeeraNumber(int n) {
        if (n <= 1) return 0;
        int countFactors = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                countFactors++;
            }
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                if (i == countFactors) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int isBunker(int[] a) {
        if (a == null || a.length == 0) return 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 1) return 1;
                }
            }
        }
        return 0;
    }
}
