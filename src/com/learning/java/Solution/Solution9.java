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

    public static int allValuesTheSame(int[] a) {
        if (a == null || a.length == 0) return 0;

        int num = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != num) return 0;
        }
        return 1;
    }

    public static int loopSum(int[ ] a, int n) {
        int sum = 0;
        int i=0;
        while (n > 0) {
            sum += a[i];
            if (i+1 >= a.length) i=0;
            else i++;
            n--;
        }
        return sum;
    }

    public static int isSquare(int n) {
        if (n < 0 ) return 0;
        if (n == 0) return 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i*i == n) return 1;
            else if (n% i == 0 && i*i > n) return 0;
        }
        return 0;
    }

    public static int isComplete(int[] a) {
        if (a == null || a.length <= 1) return 0;

        boolean firstTwo = false;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && (isSquare(a[i]) == 1)) {
                firstTwo = true;
                break;
            }
        }
        if (!firstTwo) return 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == 8) return 1;
            }
        }

        return 0;
    }

    public static int[] pairwiseSum(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 0) return null;

        int[] arr = new int[a.length / 2];

        int k = 0;
        for (int i = 0; i < a.length-1; i +=2) {
            arr[k++] = a[i] + a[i+1];
        }
        return arr;
    }

    public static int isNPrimeable (int a[], int n) {
        if (a == null || a.length == 0 ) return 0;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]+n) != 1) return 0;
        }

        return 1;
    }

    private static int isPrime(int n) {
        if ( n<= 1) return 0;

        boolean flag = false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag) return 0;

        return 1;
    }

    public static int[] computeHMS(int seconds) {
        int[] arr = new int[3];
        if (seconds == 0) return arr;

        arr[0] = seconds / 3600;
        arr[1] = (seconds % 3600) / 60;
        arr[2] = (seconds % 3600) % 60;

        return arr;
    }

    public static int isMartian(int[] a) {
        if (a == null || a.length == 0) return 0;

        int countOnes = 0, countTwos = 0;
        for (int i = 0; i <= a.length-1; i++) {
            if (i == a.length-1) {
                if (a[i] == 1) countOnes++;
                else if (a[i] == 2) countTwos++;
            } else {
                if (a[i] != a[i+1]) {
                    if (a[i] == 1) countOnes++;
                    else if (a[i] == 2) countTwos++;
                } else {
                    return 0;
                }
            }
        }

        if (countOnes <= countTwos) return 0;
        return 1;
    }

    public static int isPaired(int[] a, int n){
        if (a == null || a.length < 2) return 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == n && i+j == n) return 1;
            }
        }

        return 0;
    }

    public static int allEven(int a[]) {
        if (a == null || a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) return 0;
        }
        return 1;
    }
}
