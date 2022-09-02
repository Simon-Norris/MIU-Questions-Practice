package com.learning.java.Solution;

public class Solution10 {

    public static int hasNValues(int[] a, int n) {
        if ( n < 0 || a== null || a.length == 0 || n > a.length) return 0;

        int[] arr = new int[n];
        int count = 0;
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            int k = 0;
           boolean found = false;
           while (k < arr.length && count < arr.length) {
               if (a[i] == arr[k]) {
                   found = true;
                   break;
               }
               k++;
           }
           count++;
           if (count > n) return 0;
           if (!found) {
               arr[ind] = a[i];
               ind++;
           }
        }

        return count == n ? 1: 0;
    }

    public static int nextPerfectSquare(int n) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        int i=0;
        while (i*i <= n) i++;
        return i*i;
    }

    public static int nUpCount(int[] a, int n) {
        if (a == null || a.length == 0) return 0;

        int partialSum = 0, count = 0, prevSum = 0;

        for (int i = 0; i < a.length; i++) {
            partialSum += a[i];
            if (prevSum <= n && partialSum > n) count++;
            prevSum = partialSum;
        }
        return count;
    }

    public static int primeCount(int start, int end){
        if (start > end) return 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i <= 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        return count;
    }

    public static int isInertial(int[] a){
        if (a == null || a.length == 0) return 0;
        boolean oneOdd = false;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oneOdd = true;
            }
            if (a[i] > maxValue) maxValue = a[i];
        }
        if (!oneOdd || (maxValue % 2 != 0)) return 0;

        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] != maxValue) {
                        if (a[i] < a[j]) flag = false;
                    }
                }
            }
        }

        if (!flag) return 0;
        return 1;
    }
}
