package com.learning.java.Solution;

public class Solution7 {

    public static int isCentered(int[] a){
        if (a == null || a.length % 2 == 0) return 0;

        int centered = a[a.length/2];
        for (int i = 0; i < a.length; i++) {
            if (i == a.length/2) continue;
            if (a[i] <= centered) return 0;
        }
        return 1;
    }

    public static int isDual(int[] a){
        if (a == null) return 0;
        if (a.length == 0) return 1;
        if (a.length % 2 != 0) return 0;
        int sum = a[0]+a[1];
        for (int i = 0; i < a.length-1; i=i+2) {
            if ( a[i] + a[i+1] != sum) return 0;
        }
        return 1;
    }

    public static int isAllPossibilities(int[] a) {
        if (a == null || a.length == 0) return 0;

        int start = 0;
        int end = a.length - 1;

        for (int i = start; i < end; i++) {
            boolean found  = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]){
                    found = true;
                    break;
                }
            }
            if(!found) return 0;
        }

        return 1;
    }

    public static int factorTwoCount(int n) {
        if (n <= 0) return 0;

        int count = 0;
        while (n % 2 == 0) {
            count++;
            n = n/2;
        }
        return count;
    }

    public static int isDanpheArray(int[] a) {
        if (a == null || a.length == 0) return 0;

        int evenCount1 = 0;
        int evenCount2 = 0;

        int firstOddInedx = 0;
        int lastOddIndex = 0;

        boolean oddFound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddFound = true;
                firstOddInedx = i;
                break;
            }
        }

        if (!oddFound || firstOddInedx == a.length-1) return 0;

        boolean oddFound1 = false;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                oddFound1 = true;
                lastOddIndex = i;
                break;
            }
        }

        if (!oddFound1 || lastOddIndex == 0) return 0;

        for (int i = 0; i < firstOddInedx; i++) {
            if (a[i] % 2 == 0) evenCount1++;
            else break;
        }
        for (int i = a.length-1; i >= lastOddIndex; i--) {
            if (a[i] % 2 == 0) evenCount2++;
            else break;
        }
        if(evenCount1 != evenCount2) return 0;
        return 1;
    }

    public static int goodSpread (int[] a){
        if (a == null || a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
           if (count > 3) return 0;
        }
        return 1;
    }

    public static  int sumDigits (int n){
        if ( n == 0) return 0;

        int total = 0;
        while (n != 0) {
            int rem  = n%10;
            total += rem;
            n = n/10;
        }
        return total;
    }

    public static int isMeera (int[] a) {
        if (a == null || a.length == 0) return 0;

        for (int i=0; i<a.length;i++){
            if (a[i] >= i) return 0;
        }

        return 1;
    }

    public static int isGuthrie(int a) {
        if (a <= 0) return 0;

        int previous = 1;

        for (int i = 0; i <= a; i++) {
            int seq = i+previous;
            if (seq == a) return 1;
            previous = seq;
        }

        return 0;
    }

    public static int isFibonacci(int a) {
        if (a <= 0) return 0;

        if (a == 1) return 1;
        int previous = 1;
        int bp  = 1;

        for (int i = 0; i <= a; i++) {
            int seq = bp+previous;
            if (seq == a) return 1;
            bp = previous;
            previous = seq;
        }

        return 0;
    }


}
