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
    }
}

