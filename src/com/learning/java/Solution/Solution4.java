package com.learning.java.Solution;

public class Solution4 {
    private static int isPrime(int n) {
        if (n < 2) return 0;
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) return 0;
        return 1;
    }
    public static int isPrimeProduct(int n){
        if (n < 3) return 0;
        int count =0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                if (isPrime(i) == 1) {
                    count++;
                }
            }
        }
        int[] primeArr = new int[count];
        int k=0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                if (isPrime(i) == 1) {
                    primeArr[k++] = i;
                }
            }
        }
        for (int i = 0; i < primeArr.length; i++) {
            int firstNum = primeArr[i];
            for (int j = 0; j < primeArr.length; j++) {
                if (firstNum * primeArr[j] == n) return 1;
            }
        }
        return 0;
    }
}
