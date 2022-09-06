package com.learning.java.Solution;

public class Solution11 {

    private static int factorial(int n) {
        if ( n== 1) return 1;
        return n * factorial(n-1);
    }

    public static int[] solve10() {
        int[] result = new int[2];
        int tenFactorial = factorial(10);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ( factorial(i) + factorial(j) == tenFactorial) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int repsEqual(int[] a, int n) {
        if (a == null || a.length == 0) return 0;

        int l =0, r=a.length-1;
        while (l <= r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++; r--;
        }
        int length =0;
        while (n != 0) {
            int rem = n % 10;
            if (length < a.length && rem == a[length]) length++;
            else return 0;
            n=n/10;
        }
        return 1;
    }

    public static int henry (int i, int j) {
        return findPerfectNumber(i) + findPerfectNumber(j);
    }

    private static int findPerfectNumber(int n) {
        int timesPerfectNumberFound = 0;
        for (int i = 1;  ; i++) {
            if ( i == perfectNumber(i)) {
                timesPerfectNumberFound++;
                if (timesPerfectNumberFound == n) {
                    return i;
                }
            }
        }
    }

    private static int perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}
