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
}
