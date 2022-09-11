package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 0, 3, 4};
        System.out.println("Is railRoad Tie ? "+Solution13.isRailRoadTie(arr1));

        int n2 = 94;
        System.out.println("The number of fullness quotient are: "+Solution13.fullnessQuotient(n2));

        int[] arr3 ={0,0} ;
        System.out.println("Is packed: "+Solution13.isPacked(arr3));

        int[] arr4 ={2,5,3};
        System.out.println("Is Odd Heavy: "+Solution13.isOddHeavy(arr4));

        int n = 128;
        int p = 4;
        System.out.println("The largest exponent is: "+Solution13.getExponent(n, p));

        int[] arr6 =  {9,-9};
        int n6 = 5;
        int[] res = Solution13.filterArray(arr6, n6);
        if (res == null || res.length == 0) System.out.println("NULL || EMPTY");
        else {
            System.out.println("The filtered array is");
            for (int re : res) {
                System.out.print(re + " ");
            }
        }

        int n7 = 13332;
        int catLength = 5;
        System.out.println("Is it concatenated Sum ? "+Solution13.checkConcatenatedSum(n7, catLength));

        int[] arr8 = {1,2,3,4,5};
        int m8 = 1;
        int n8 = 5;
        System.out.println("Is sequenced array ?"+Solution13.isSequencedArray(arr8,m8,n8));

        int n9 = 6937;
        System.out.println("The largest prime factor is: "+Solution13.largestPrimeFactor(n9));

        int n10 = 42;
        int[] response10 = Solution13.encodeNumber(n10);
        System.out.println("The encode numbers are: ");
        if (response10 == null || response10.length == 0) System.out.println("NULL || EMPTY");
        else {
            for (int i = 0; i < response10.length; i++) {
                System.out.print(response10[i]+ " ");
            }
        }

        int[] arr10 ={1, 1, 1, 1, 2, 2, 3, 3,4} ;
        int[] pattern = {1, 2, 3,5,6};
        System.out.println("\nDoes the pattern matches ? "+Solution13.matchPattern(arr10,arr10.length, pattern, pattern.length));
    }
}

