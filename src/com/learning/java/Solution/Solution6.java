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

    public static int isFibonacci(int n) {
        if (n <= 0) return 0;
        int previous = 1;
        int beforePrevious = 1;
        for (int i = 0; i < n; i++) {
            int sum = previous + beforePrevious;
            if (sum == n) return 1;
            beforePrevious = previous;
            previous = sum;
        }
        return 0;
    }

    public static int isBeanArray(int[] a) {
        if (a == null || a.length <= 1) return 0;

        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]+1 || a[j] == a[i]-1) {
                    found = true;
                    break;
                }
            }

            if (!found) return 0;
        }
        return 1;
    }

    public static int isFancyArray(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int grandParent = 1;
        int parent = 1;
        for (int i = 0; i < n; i++) {
            int fancyNum = 3 * parent + 2 * grandParent;
            if (fancyNum == n) return 1;
            grandParent = parent;
            parent = fancyNum;
        }
        return 0;
    }

    public static int isBunker(int n) {
        if (n == 0) return 0;

        int previous = 1;

        for (int i = 0; i < n; i++) {
            int next = i + previous;
            if (n == next) return 1;
            previous = next;
        }
        return 0;
    }

    public static int isOddHeavy(int[] a){
        if (a == null || a.length == 0) return 0;

        boolean oneOdd = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oneOdd = true;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] > a[i]) return 0;
                }
            }
        }
        if (!oneOdd) return 0;
        return 1;
    }

    public static int isNormal(int n) {
        if (n <= 1) return 0;

        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0 &&  i % 2 != 0) return 0;
        }

        return 1;
    }
}
