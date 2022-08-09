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

    /**
     * Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers between m and n inclusive.
     * Furthermore, the array must be in ascending order and contain only those integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced
     * array. The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced
     * array because the 0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.
     * Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array, otherwise it returns 0.
     * If you are writing in Java or C# the function signature is
     * int isSequencedArray(int[ ] a, int m, int n)
     * If you are writing in C or C++ the function signature is
     * int isSequencedArray(int a[ ], int len, int m, int n) where len is the number of elements in the array a.
     * You may assume that m<=n.
     * **/
   public static int isSequencedArray(int[] a, int m, int n) {
        int start = a[0];
        int end = a[a.length-1];
        if ( start != m  || end != n) return 0;
        for (int i=0; i+1 < a.length; i++) {
            if (a[i] > a[i+1]) return 0;
        }
        int arrLength = removeDuplicates(a);
        for (int i=0; i<arrLength; i++){
            if (m != a[i]) {
                return 0;
            }
            m++;
        }
        return 1;
   }
   /**
    * Removes all the duplicate elements in an array.
    * Returns the length of array upto which the elements are unique.
    * Array should be sorted before invoking this function.
    * **/
   private static int removeDuplicates(int[] arr) {
       int slowPointer =0 , fastPointer = 1;
       while (fastPointer < arr.length) {
           if (arr[slowPointer] != arr[fastPointer]) {
               arr[slowPointer+1] = arr[fastPointer];
               slowPointer++;
           }
           fastPointer++;
       }
       return slowPointer+1;
   }
}
