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

    public static int isNiceArray(int[] a) {
        if (a == null || a.length <= 2) return 0;

        for (int i = 0; i < a.length; i++) {
            int valuePlusOne = a[i]+1;
            int valueMinusOne = a[i]-1;
            boolean valueFound = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == valuePlusOne || a[j] == valueMinusOne) {
                    valueFound = true;
                    break;
                }
            }
            if (!valueFound) return 0;

        }
        return 1;
    }

    public static int isContinousFactored(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                int multiplication = 1;
                multiplication *= i;
                for (int j = i+1; j <= n/2 ; j++) {
                    if(n % j == 0) {
                        multiplication *= j;
                        if (multiplication == n) return 1;
                        else if (multiplication > n) break;
                    } else {
                        break;
                    }
                }
            }
        }
        return 0;
    }

    public static int isTwin(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == 1) {
                boolean primeFound = false;
                for (int j = 0; j < arr.length; j++) {
                    if (isPrime(arr[j]) == 1) {
                        if (arr[j] == arr[i]-2 || arr[j] == arr[i]+2){
                            primeFound = true;
                            break;
                        }
                    }
                }
                if (!primeFound) return 0;
            }
        }
        return 1;
    }

    public static int isSetEqual(int[ ] a, int[ ] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) return 0;
        if (a.length >= b.length) {
            for (int i = 0; i < a.length; i++) {
                int el = a[i];
                boolean elFound = false;
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == el) {
                        elFound = true;
                        break;
                    }
                }
                if (!elFound) return 0;
            }
        } else {
            for (int i = 0; i < b.length; i++) {
                int el = b[i];
                boolean elFound = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == el) {
                        elFound = true;
                        break;
                    }
                }
                if (!elFound) return 0;
            }
        }
        return 1;
    }

    public static int isSmart(int n){
        int i = 1;
        int var = 1;
        while (i <= n) {
            // if the number is in the sequence return 1
            if (n == var) return 1;
            var += i;
            i++;
        }
        return 0;
    }

    public static int isNiceArrayAnother(int[] a) {
        if (a == null || a.length == 0) return 0;

        int primeTotal=0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                primeTotal += a[i];
            }
        }
        if (a[0] == primeTotal) return 1;

        return 0;
    }
}
