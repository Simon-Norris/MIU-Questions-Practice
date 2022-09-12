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

    public static int isTwinoid (int [] a) {
        if (a == null || a.length == 0) return 0;

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) count++;
        }
        if (count == 2) {
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] % 2 == 0 && a[i+1] % 2 == 0) return 1;
            }
        }
        return 0;
    }

    public static int isBalanced(int[] a) {
        if (a == null || a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            int num = -1 * a[i];
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) return 0;
        }

        return 1;
    }

    public static int getExponent(int n, int p){
        if (p<=1 ) return -1;

        int countP = 0;
        if (n < 0) {
            p = -1 *p;
            for (int i = -2; i >= n; i--) {
                if (n % i == 0) {
                    if (i == p) {
                        while (n % p  == 0) {
                            countP++;
                            n = n/p;
                        }
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++) {
           if (n % i == 0) {
               if (i == p) {
                   while (n % p  == 0) {
                       countP++;
                       n = n/p;
                   }
               }
           }
        }

        return countP;
    }

    public static int is121Array(int[] a){
        if (a == null || a.length <= 2) return 0;

        if (a[0] != 1 || a[a.length-1] != 1) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0 || a[i] >= 3) return 0;
        }

        int countFirstOnes = 0, countLastOnes = 0;


        for (int j : a) {
            if (j == 1) countFirstOnes++;
            else break;
        }

        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] == 1) countLastOnes++;
            else break;
        }

        boolean found = false;

        for (int j : a) {

            if (j == 2) {
                found = true;
                break;
            }
        }

        if(!found || (countFirstOnes != countLastOnes)) return 0;

        return 1;

    }

    public static int isMaxMinEqual(int[] a) {
        if (a == null || a.length == 0) return 0;

        int max = Integer.MIN_VALUE, countMax = 0;
        int min = Integer.MAX_VALUE, countMin = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        if (max == min) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) countMax++;
            if (a[i] == min) countMin++;
        }

        if (countMax == countMin) return 1;

        return 0;
    }

    public static int isOddSpaced (int a[]) {
        if (a == null || a.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        int diff = max - min;

        if (diff % 2 != 0 ) return 1;

        return 0;
    }

}
