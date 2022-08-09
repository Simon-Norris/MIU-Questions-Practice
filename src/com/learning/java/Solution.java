package com.learning.java;

public class Solution {
    /**
     * . The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its digits is concatenated twice and then summed, the result
     * will be the original number. It turns out that 198 is the only number with this property. However, the property can be generalized so
     * that each digit is concatenated n times and then summed. For example, 2997 = 222+999+999+777 and here each digit is concatenated
     * three times. Write a function named checkContenatedSum that tests if a number has this generalized property.
     * The signature of the function is
     * int checkConcatenatedSum(int n, int catlen) where n is the number and catlen is the number of times to concatenate each digit
     * before summing.
     * The function returns 1 if n is equal to the sum of each of its digits contenated catlen times. Otherwise, it returns 0. You may assume
     * that n and catlen are greater than zero
     * Hint: Use integer and modulo 10 arithmetic to sequence through the digits of the argument.
     * **/
    public static int checkConcatenatedSum(int n , int catLength) {
        int copyN = n;
        int total = 0;
        while (n > 0) {
            int r = n%10;
            int multiple10 = 1;
            for (int i=0; i<catLength; i++) {
                total += r*multiple10;
                multiple10 *= 10;
            }
            n = n/10;
        }
        if (total != copyN) {
            return 0;
        }
        return 1;
    }
}
