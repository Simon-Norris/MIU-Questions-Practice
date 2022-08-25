package com.learning.java.Solution;

public class Solution9 {

    public static int isSuper(int[] a) {
        if (a == null || a.length == 0) return 0;

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= sum) return 0;
            sum += a[i];
        }

        return 1;
    }

    public  static  int isSym (int [] a) {
        if (a == null || a.length == 0) return 0;

        int left = 0, right = a.length-1;
        while (left <= right) {
            if (a[left] % 2 == 0) {
                if (a[right] % 2 != 0) return 0;
            } else{
                if (a[right] % 2 == 0) return 0;
            }
            left++;right--;
        }
        return 1;
    }

    public static int factorTwoCount (int n) {
        if (n % 2 != 0) return 0;

       int count = 0;
       while (n % 2 == 0) {
           count++;
           n = n/2;
       }
       return count;
    }

    public static int isConsecutiveFactored(int n) {
        if ( n <= 0) return 0;

        for (int i = 1; i <= n ; i++) {
           if (i == 1) continue;
           if (n % i == 0) {
               int j = i+1;
               if (n % j == 0) return 1;
           }
        }

        return 0;
    }

    public static void updateMileageCounter(int[] a, int miles){
        if (a == null || a.length == 0) return;

        for (int i = 0; i < miles; i++) {
            addMile(a);
        }
    }

    private static void addMile(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 9) {
                a[i] += 1;
                break;
            }
            a[i] = 0;
        }
    }

    public static double eval(double x, int[] a) {
        if (a == null || a.length == 0) return 0.0;

        double total = 0.0;

        for (int i = a.length-1; i >= 0; i--) {
            total +=a[i] * getVal(i, x);
        }

        return total;
    }

    private static double getVal(int i, double x) {
        double mult =1.0;

        while (i > 0) {
            mult *= x;
            i--;
        }

        return mult;
    }
}
