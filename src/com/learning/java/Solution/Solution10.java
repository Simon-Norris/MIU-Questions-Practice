package com.learning.java.Solution;

public class Solution10 {

    public static int hasNValues(int[] a, int n) {
        if ( n < 0 || a== null || a.length == 0 || n > a.length) return 0;

        int[] arr = new int[n];
        int count = 0;
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            int k = 0;
           boolean found = false;
           while (k < arr.length && count < arr.length) {
               if (a[i] == arr[k]) {
                   found = true;
                   break;
               }
               k++;
           }
           count++;
           if (count > n) return 0;
           if (!found) {
               arr[ind] = a[i];
               ind++;
           }
        }

        return count == n ? 1: 0;
    }

    public static int nextPerfectSquare(int n) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        int i=0;
        while (i*i <= n) i++;
        return i*i;
    }

    public static int nUpCount(int[] a, int n) {
        if (a == null || a.length == 0) return 0;

        int partialSum = 0, count = 0, prevSum = 0;

        for (int i = 0; i < a.length; i++) {
            partialSum += a[i];
            if (prevSum <= n && partialSum > n) count++;
            prevSum = partialSum;
        }
        return count;
    }

    public static int primeCount(int start, int end){
        if (start > end) return 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i <= 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        return count;
    }

    public static int isInertial(int[] a){
        if (a == null || a.length == 0) return 0;
        boolean oneOdd = false;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oneOdd = true;
            }
            if (a[i] > maxValue) maxValue = a[i];
        }
        if (!oneOdd || (maxValue % 2 != 0)) return 0;

        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] != maxValue) {
                        if (a[i] < a[j]) flag = false;
                    }
                }
            }
        }

        if (!flag) return 0;
        return 1;
    }

    public static int countSquarePairs(int[] a) {
        if (a == null || a.length <= 1) return 0;

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i-1;
            while (j >=0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ( i == j) continue;
                int sum = a[i]+a[j];
                if (( a[i] > 0 && a[j] > 0) && a[i] < a[j] && (isPerfectSquare(sum) == 1)) count++;
            }
        }
        return count;
    }

    private static int isPerfectSquare(int n) {
        for (int i = 0; i <= n; i++) {
            if ( i * i == n) return 1;
            if ( i * i > n) break;
        }
        return 0;
    }

    public static int isPrime(int n) {
        if ( n <= 1) return 0;

        for (int i = 2; i <= n/2; i++) {
            if ( n % i == 0) return 0;
        }

        return 1;
    }

    public static int findProcupineNumber(int n) {
        for (int i = n+1; ; i++) {
            if (isPrime(i) == 1) {
                if ( i % 10 == 9) {
                    for (int j = i+1;  ; j++) {
                        if (isPrime(j) == 1 && j % 10 == 9) {
                            return i;
                        }
                        else if (isPrime(j) == 1 && j % 10 != 9) break;
                    }
                }
            }
        }
    }

    public static int isGutherieSequence(int[] a) {
        if (a == null || a.length == 0) return 0;

        int num = a[0];
        if (a[a.length-1] != 1 || num <= 0) return 0;
        int[] arr = createSequence(num);
        if (arr.length != a.length) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != arr[i]) return 0;
        }
        return 1;
    }

    public static int[] createSequence(int num) {
        int k=0, n = num;
        while (num != 1){
            if (num % 2 == 0) {
                num = num / 2;
            } else{
                num = num * 3 +1;
            }
            k++;
        }
        int[] arr = new int[k+1];
        arr[0] = n;
        k=1;
        while (n != 1){
            if (n % 2 == 0) {
                n = n / 2;
            } else{
                n = n * 3 +1;
            }
            arr[k] = n;
            k++;
        }
        return arr;
    }

    public static int stantonMeasure(int[] a) {
        if (a == null || a.length == 0) return 0;

        int count1s = 0;
        for (int i =0; i< a.length; i++) {
            if (a[i] == 1) count1s++;
        }
        int count = 0;
        for (int i =0; i< a.length; i++) {
            if (a[i] == count1s) count++;
        }

        return count;
    }

    public static int sumFactor(int[] a) {
        if (a == null || a.length == 0) return 0;

        int sum = 0;
        for (int i =0; i< a.length; i++) {
           sum += a[i];
        }
        int count = 0;
        for (int i =0; i< a.length; i++) {
            if (a[i] == sum) count++;
        }
        return count;
    }

    public static int gutherieIndex(int num) {
        if (num <= 0) return 0;
        int count = 0;
        while (num != 1){
            if (num % 2 == 0) {
                num = num / 2;
            } else{
                num = num * 3 +1;
            }
            count++;
        }

        return count;
    }
}
