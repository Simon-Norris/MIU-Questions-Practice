package com.learning.java.Solution;

public class Solution13 {

    public static int isRailRoadTie(int[] a) {
        if ( a == null || a.length <= 1) return 0;

        boolean hasNonZero = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) hasNonZero = true; break;
        }

        if (!hasNonZero) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if ( i == 0) {
                    if (a[i+1] == 0) return 0;
                } else if ( i == a.length -1) {
                    if (a[i-1] == 0) return 0;
                } else {
                    if ((a[i+1] == 0 && a[i-1] == 0) || (a[i+1] != 0 && a[i-1] != 0)) return 0;
                }
            } else {
                if ( i == 0) return 0;
                else if ( i == a.length -1) return 0;
                else {
                    if ((a[i+1] == 0 || a[i-1] == 0)) return 0;
                }
            }
        }
        return 1;
    }

    public static int fullnessQuotient(int n) {
        if ( n < 1) return -1;
        int count = 0;
        for (int i = 2; i <= 9; i++) {
            int num = n;
            boolean zeroFound = false;
            while (num != 0) {
                int rem = num % i;
                if (rem == 0) {
                    zeroFound = true;
                    break;
                }
                num = num / i;
            }
            if (!zeroFound) count++;
        }
        return count;
    }

    public static int isPacked(int[] a) {
        int  i =0;
        while (i < a.length) {
            if (a[i] < 0) return 0;
            int k = i;
            int count = 1;
            while (k+1 < a.length && a[k] == a[k+1]) {
                count++;
                k++;
            }
            if (a[i] != count) return 0;
            i =k+1;
        }
        return 1;
    }

    public static int isOddHeavy(int[] a) {
        if (a == null || a.length == 0) return 0;

        boolean hasOdd = false;

        for (int i = 0; i < a.length; i++) {
           if (a[i] % 2 != 0) {
               hasOdd = true;
               break;
           }
        }
        if (!hasOdd) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (a[j] > a[i]) return 0;
                    }
                }
            }
        }

        return 1;
    }

    public static int getExponent(int n, int p) {
        if ( p <= 1) return -1;
        int large = 0;
        for (int i = 0;  ; i++) {
            int res = power(p,i);
            if (n % res == 0) {
                large = i;
            }
            if (res > Math.abs(n)) break;
        }
        return large;
    }

    private static int power(int base, int exp) {
        if (exp == 0) return 1;

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }
}
