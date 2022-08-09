package com.learning.java.Solution;

public class Solution1 {
    public static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        int i = 0, k = 0, matches = 0;
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k]) {
                matches++;
            } else if (matches == 0 || k == patternLen - 1) {
                return 0;
            } else {
                k++;
                if (a[i] == pattern[k]) {
                    matches++;
                } else {
                    return 0;
                }
            }
        }
        if (i == len && k == patternLen - 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int largestPrimeFactor(int n) {
        if (n <=1) return 0;
        int largestPrime = 2;
        for(int i=2; i<=n/2;i++) {
            if (n%i == 0 && isPrime(i)){
                largestPrime = i;
            }
        }
        return largestPrime;
    }

    private static boolean isPrime(int n) {
        if (n <=1) return false;
        for (int i=2; i<n/2;i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
