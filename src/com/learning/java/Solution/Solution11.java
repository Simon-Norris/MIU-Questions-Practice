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

    public static int isDivisible(int[] a, int divisor){
        for (int i = 0; i < a.length; i++) {
           if (a[i] % divisor != 0) return 0;
        }
        return 1;
    }

    public static int nUnique(int[] a, int n) {

        if ( a == null || a.length <= 1) return 0;

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if ( i == j ) continue;
                if ( a[i] + a[j] == n) count++;
            }
        }

        if (count != 1) return 0;
        return 1;
    }

    public static int isSquare(int n) {

        for (int i = 0; i <= n; i++) {
            if ( i*i == n) return 1;
            else if (i*i > n) break;
        }

        return 0;
    }

    public static int isLegalNumber(int[] a, int base) {
        for (int i = 0; i < a.length; i++) {
           if ( a[i] >= base) return 0;
        }
        return 1;
    }

    public static int convertToBase10(int[] a, int base) {
        if (isLegalNumber(a, base) == 0) return -1;
        int incrementor = 0, result = 0;
        for (int i = a.length-1; i >= 0; i--) {
            result += a[i] * power(base, incrementor);
            incrementor++;
        }
        return result;
    }

    private static int power(int base, int incrementor) {
        int result = 1;
        for (int i = 0; i < incrementor; i++) {
            result = result * base;
        }
        return result;
    }

    public static int computeDepth(int n) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int k = 0;
        int count =0;
        for (int i = 1;  k != arr.length ; i++) {
            int num = i * n;
            while (num != 0) {
                int r = num % 10;
                boolean seen = false;
                for (int j = 0; j < arr.length; j++) {
                    if ( arr[j] == r) {
                        seen = true;
                        break;
                    }
                }

                if (!seen) {
                    arr[k] = r;
                    k++;
                }
                num = num / 10;
            }
            count++;
        }
        return count;
    }

    public static int matches(int[] a, int[] p){
        int prev = 0;
        for (int i = 0; i < p.length; i++) {
            int element = p[i];
            int k = prev;
            if (element > 0) {
                for (int j = prev; j < prev+element; j++) {
                    if (a[k] < 0) return 0;
                    k++;
                }
            } else {
                for (int j = prev; j < prev+Math.abs(element); j++) {
                    if (a[k] > 0) return 0;
                    k++;
                }
            }
            prev += Math.abs(element);
        }
        return 1;
    }
}
