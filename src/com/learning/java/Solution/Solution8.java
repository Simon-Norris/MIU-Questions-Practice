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

    public static int isRiley (int n){
        while ( n != 0) {
            int r = n%10;
            if (r % 2 != 0) return 0;
            n /= 10;
        }
        return 1;
    }

    public static int lastEven (int[] a) {
        if (a == null || a.length == 0) return -1;

        for (int i = a.length-1; i >=  0; i--) {
            if (a[i] % 2 == 0) return i;
        }

        return -1;
    }

    public static int isEvenSubset(int m, int n) {
        if ( m == 0 || n == 0) return 0;

        for (int i = 1; i <= m; i++) {
            if (i % 2 == 0 && m % i == 0) {
                boolean match = false;
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 0 && n % j == 0) {
                        if (i == j) {
                            match = true;
                            break;
                        }
                    }
                }
                if (!match) return 0;
            }
        }

        return 1;
    }

}
