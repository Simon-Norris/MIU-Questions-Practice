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

    public static int isTwinPrime(int n) {
        if (n <=1) return 0;
        if (isPrime(n+2) || isPrime(n-2)) return 1;
        return 0;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largestAdjacentSum(int[] arr) {
        if (arr.length < 2) return -1;
        int k = 2;
        int currentSum =0, windowStart=0, maximum=Integer.MIN_VALUE;
        for (int windowEnd=0; windowEnd < arr.length; windowEnd++) {
            currentSum += arr[windowEnd];
            if (windowEnd >= (k-1)){
                maximum = Math.max(maximum, currentSum);
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maximum;
    }

    public static int isZeroBalanced(int[] arr) {
        if (arr == null || arr.length == 0 ) return 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == arr.length) return 1;
        if (arr.length % 2 != 0) return 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum != 0) return 0;
        int[] neg = new int[arr.length / 2];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg[k] = arr[i];
                k++;
            }
        }
        boolean isCounterPart = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j< neg.length; j++) {
                    if (arr[i] == Math.abs(neg[j])){
                        isCounterPart = true;
                        break;
                    }
                }
            }
        }
        if (isCounterPart) return 1;
        return 0;
    }

    public static int findSmallestBEQNumber(){
        for (int i = 1; ; i++) {
            int cubeOfNumber = Math.abs(i * i *i);
            if (cubeOfNumber == 0) return 0;
            int countSixes = 0;
            while (cubeOfNumber != 0) {
                int r = cubeOfNumber % 10;
                if (r == 6) countSixes++;
                cubeOfNumber = cubeOfNumber/10;
            }
            if (countSixes == 4) return i;
        }
    }
    public static int isCubePerfect(int[] a) {
        for (int i=0; i<a.length;i++) {
            int num = a[i];
            boolean flag = false;
            if (num < 0) {
                int j = -1;
                while ((j*j*j) >= num) {
                    if ((j*j*j) == num) {
                        flag = true;
                        break;
                    }
                    j--;
                }
            } else {
                int j = 0;
                while ((j*j*j) <= num) {
                    if ((j*j*j) == num) {
                        flag = true;
                        break;
                    }
                    j++;
                }
            }
            if (!flag) return 0;

        }
        return 1;
    }
}
