package com.learning.java.Solution;

public class Solution8 {

    public static int isPascal (int n){
        if (n <= 0) return 0;

        int sum=0;
        for (int i = 1; i <= n; i++) {
             sum += i;
            System.out.print(sum + " ");
            if (sum == n) return 1;
        }

        return 0;
    }

    public static boolean sumIsPower(int[] arr){
        if (arr == null) return false;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int mul = 1;
        while (mul <= sum) {
            if (mul == sum) return true;
            mul =  2 * mul;
        }

        return false;
    }
}
