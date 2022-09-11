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
}
