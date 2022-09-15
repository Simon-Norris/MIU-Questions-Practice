package com.learning.java.Solution;

public class Solution14 {

    public static void doIntegerBasedRounding(int[] a, int n) {
        if ( n <= 0) return;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) continue;
            int val = (a[i] / n) * n;
            if (Math.abs(a[i] - val) < Math.abs(a[i] - val - n)) a[i] = val;
            else a[i] = val + n;
        }
    }

    public static int isCubePowerful (int n) {
        if ( n <= 0) return 0;
        int sum = 0, num = n;
        while (num != 0) {
            int r = num % 10;
            sum +=  (r * r * r);
            num = num / 10;
        }

        if (sum == n) return 1;
        return 0;
    }

    public static int decodeArray (int[] a) {
        int result =0, mult = 1;

        for (int i = a.length-1; i - 1 >= 0; i--) {
            int diff = Math.abs(a[i-1] - a[i]);
            result += diff * mult;
            mult *= 10;
        }

        if (a[0] < 0) return -result;
        return result;
    }

    public static int isZeroPlentiful(int[] a) {
        if (a == null || a.length == 0) return 0;

        int i = 0, found = 0;
        while (i < a.length) {
            if (a[i] == 0) {
                int j = i;
                int count = 0;
                while (j < a.length && a[j] == 0) {
                    count++;
                    j++;
                }
                if (count < 4) return 0;
                i = j; found++;
            } else {
                i++;
            }
        }

        return found;
    }

    public static int is235Array(int[] a) {
        int by2 = 0, by3 =0, by5 = 0, byNone = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                by2++;
                if (a[i] % 3 == 0) by3++;
                if (a[i] % 5 == 0) by5++;
            } else if (a[i] % 3 == 0) {
                by3++;
                if (a[i] % 2 == 0) by2++;
                if (a[i] % 5 == 0) by5++;
            } else if (a[i] % 5 == 0) {
                by5++;
                if (a[i] % 2 == 0) by2++;
                if (a[i] % 3 == 0) by3++;
            } else byNone++;
        }
        if (by2+by3+by5+byNone == a.length) return 1;
        return 0;
    }

    public static int isTriangular(int n) {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum == n) return 1;
            if (sum > n) break;
        }
        return 0;
    }

    public static int isMercurial(int[] a) {
        int i =0;
        boolean firstOne = false, mid3 = false, lastOne = false;
        while (i < a.length) {
            if (a[i] == 1) {
                firstOne = true;
                break;
            }
            i++;
        }
        if (!firstOne) return 1;

        while (i+1 < a.length) {
            if (a[i] == 3) {
                mid3 = true;
                break;
            }
            i++;
        }
        if (!mid3) return 1;

        while (i+1 < a.length){
            if (a[i+1] == 1) {
                lastOne = true;
                break;
            }
            i++;
        }
        if (lastOne) return 0;
        return 1;
    }
}
