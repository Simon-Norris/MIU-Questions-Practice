package com.learning.java.Solution;

public class Solution3 {
    public static int hollowArray(int[] arr) {
        int pre = 0;
        int zero = 0;
        int post =0;
        int i=0;
        while(i<arr.length && arr[i] != 0) {
            pre++;
            i++;
        }
        while(i < arr.length && arr[i] == 0) {
            zero++;
            i++;
        }
        while(i < arr.length && arr[i] != 0) {
            post++;
            i++;
        }
        if (zero < 3 || pre != post || (pre+zero+post != arr.length)) return 0;
        return 1;
    }

    public static int isConsecutiveFactored(int n) {
        if (n <= 0) return 0;
        int count=0;

        // to find exact count of factors that we are going to get
        for (int i=2; i<=n/2;i++) {
            if (n%i == 0) {
                count++;
            }
        }

        // to put all the factors of the number in the array
        int[] arr = new int[count];
        int k=0;
        for (int i=2; i<=n/2;i++) {
            if (n%i == 0) {
                arr[k++] = i;
            }
        }

        // compare with the next factor whether they are consecutive factored or not
        for(int i=0; i<arr.length-1;i++) {
            int next = arr[i+1];
            int current = arr[i] + 1;
            if (next == current) return 1;
        }
        return 0;
    }
}
