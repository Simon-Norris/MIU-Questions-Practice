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

    public static int countRepresentations(int numRupees) {
        int count = 0;
        for (int rupee20 = 0; rupee20 <= numRupees; rupee20++) {
            for (int rupee10 = 0; rupee10 <= numRupees; rupee10++) {
                for (int rupee5 = 0; rupee5 <= numRupees; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= numRupees; rupee2++) {
                        for (int rupee1 = 0; rupee1 <= numRupees ; rupee1++) {
                            if (rupee1 + 2*rupee2 + 5*rupee5 + 10*rupee10 + 20*rupee20 == numRupees){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static int sequentiallyBounded(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int num = a[i];
            if (num > a[i+1]) return 0;
            int countNum = 0;
            for (int j = 0; j < a.length; j++) {
               if (a[j] == num) countNum++;
            }
            if( countNum >= num) return 0;
        }
        return 1;
    }

    public static int minMaxDisjoint(int[] a) {
        if (a == null || a.length <= 1) return 0;

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            else if (a[i] == max) return 0;
        }

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            else if (a[i] == min) return 0;
        }

        if (max == min) return 0;

        for (int i = 0; i < a.length-1; i++) {
            if ((a[i] == max && a[i+1] == min) || (a[i] == min && a[i+1] == max)) return 0;
        }
        return 1;
    }
}
