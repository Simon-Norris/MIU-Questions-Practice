package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {


        int one = 10;
        int response = Solution8.isPascal(one);
        if (response == 1) {
            System.out.println("Is Pascal Number?: true");
        } else {
            System.out.println("Is Pascal Number?: false");
        }

        int[] arr = {4};
        boolean response2 = Solution8.sumIsPower(arr);
        if (response2) {
            System.out.println("Sum is Power");
        } else {
            System.out.println("Sum is not Power");
        }

        int two = -2126;
        int response3 = Solution8.isRiley(two);
        if (response3 == 1) {
            System.out.println("Is Riley Number?: true");
        } else {
            System.out.println("Is Riley Number?: false");
        }

        int[] arr2 = {2};
        System.out.println("The last even number index in given array is: "+Solution8.lastEven(arr2));

        int m = 32, n= 18;
        int response4 = Solution8.isEvenSubset(m, n);
        if (response4 == 1) {
            System.out.println("m is the even subset of n.");
        } else {
            System.out.println("m is not the even subset of n!!");
        }

        int[] arr3 = {3, 3, 2, 2, 1, 7};
        int response5 = Solution8.isTwinoid(arr3);
        if (response5 == 1) {
            System.out.println("Is Twinoid ? : true");
        } else {
            System.out.println("Is Twinoid ? : false");
        }

        int[] arr4 = {3, -3, 2, -2, -1, 1};
        int response6 = Solution8.isBalanced(arr4);
        if (response6 == 1) {
            System.out.println("Is Balanced? : true");
        } else {
            System.out.println("Is Balanced? : false");
        }

        int n1 = -250, p= 5;
        int response7 = Solution8.getExponent(n1, p);
        System.out.println("The exponenet of the given number n is: "+response7);


        int[] arr5 = {1,1,1,1,1,1,1,2,2,1,1, 1};
        int response8 = Solution8.is121Array(arr5);
        if (response8 == 1) {
            System.out.println("Is 121 Array? : true");
        } else {
            System.out.println("Is 121 array? : false");
        }

        int[] arr6 = {2, 4, 6, 8, 11} ;
        int response9 = Solution8.isMaxMinEqual(arr6);
        if (response9 == 1) {
            System.out.println("Is Max Min Equal?: true");
        } else {
            System.out.println("Is Max Min Equal?: false");
        }

        int[] arr7 = {80, -56, 11, -81} ;
        int response10 = Solution8.isOddSpaced(arr7);
        if (response10 == 1) {
            System.out.println("Is Array odd Spaced ?: true");
        } else {
            System.out.println("Is Array odd Spaced ?: false");
        }
    }
}

