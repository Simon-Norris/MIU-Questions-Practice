package com.learning.java.Solution;

public class Solution4 {
    private static int isPrime(int n) {
        if (n < 2) return 0;
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) return 0;
        return 1;
    }
    public static int isPrimeProduct(int n){
        if (n < 3) return 0;
        int count =0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                if (isPrime(i) == 1) {
                    count++;
                }
            }
        }
        int[] primeArr = new int[count];
        int k=0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                if (isPrime(i) == 1) {
                    primeArr[k++] = i;
                }
            }
        }
        for (int i = 0; i < primeArr.length; i++) {
            int firstNum = primeArr[i];
            for (int j = 0; j < primeArr.length; j++) {
                if (firstNum * primeArr[j] == n) return 1;
            }
        }
        return 0;
    }

    public static int isBalanced(int[] a) {
        if (a == null || a.length <= 1) return 0;
        for (int i = 0; i < a.length; i++) {
           if ( i % 2 == 0) {
               if (a[i] % 2 != 0) return 0;
           } else {
               if (a[i] % 2 == 0) return 0;
           }
        }
        return 1;
    }

    public static int isCentered(int[] a) {
        if (a.length % 2 == 0) return 0;
        int midElement = a.length / 2;
        for (int j = 0; j < a.length; j++) {
            if (j == midElement) continue;
            if (a[j] <= a[midElement]) return 0;
        }
        return 1;
    }

    public static boolean hasKSmallFactors(int k, int n){
        if (k < 0 || n < 0) return false;
        boolean hasKSmallFactors = false;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i*j == n) {
                    if (i < k && j <k) {
                        hasKSmallFactors = true;
                        break;
                    }
                }
            }
        }
        return hasKSmallFactors;
    }

    public static int isZeroLimited(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 1;
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            int index = 3*n + 1;
            if (i == index) {
                if (arr[i] != 0) return 0;
                else n++;
            } else {
                if (arr[i] == 0) return 0;
            }
        }
        return 1;
    }

    public static int[] fill(int[] arr, int k, int n) {
        if (arr == null || k <= 0|| n<= 0) return null;
        int[] arr2 = new int[n];
        int i=0;
        while (i < arr2.length){
            for (int j = 0; j < k && i< arr2.length; j++) { // j < k && i< arr2.length so that the i doesn't gets out of bound
                arr2[i] = arr[j];
                i++;
            }
        }
        return arr2;
    }

    public static  int minDistance(int n){
        if (n <= 1) return 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] arr = new int[count];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[k++] = i;
        }
        int minDistance = arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            int var = arr[i + 1] - arr[i];
            if (var < minDistance) minDistance = var;
        }
        return minDistance;
    }

    public static  int minDistance2(int n){
        if (n <= 1) return 0;
        int min = n, prevFactor = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if ((i-prevFactor) < min) {
                    min = i - prevFactor;
                }
                prevFactor = i;
            }
        }
        return min;
    }

    public static  int isWave (int [ ] a) {
        if (a == null || a.length == 0) return 0;
        for (int i = 0; i < a.length-1; i++) {
            if ( a[i] % 2 == 0) {
                if ( a[i+1] % 2 == 0) return 0;
            } else {
                if (a[i+1] % 2 != 0) return 0;
            }
        }
        return 1;
    }

    public static int isBean (int[ ] a){
        if (a == null || a.length == 0) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9){
                boolean thirteenFound = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 13) {
                        thirteenFound = true;
                        break;
                    }
                }
                if (!thirteenFound) return 0;
            }
            if (a[i] == 7) {
                boolean contains16 = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 16) {
                        contains16 = true;
                        break;
                    }
                }
                if (contains16) return 0;
            }
        }
        return 1;
    }

}
