package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

//        int digit = 6;
//        int n = 333333123;
//        System.out.printf("The number of %s in %s is %s ", digit, n, Solution5.countDigit(n, digit));
//        System.out.println();
//
//        int[] arr ={4, 9, 6, 15, 21};
//        int response = Solution5.isBunkerArray(arr);
//        if (response == 1) {
//            System.out.println("Is Bunker Array?: true");
//        } else{
//            System.out.println("Is Bunker Array?: false");
//        }

//        int[] arr ={3,-5,2, 4};
//        int response = Solution5.isMeera(arr);
//        if (response == 1) {
//            System.out.println("Is Meera Array?: true");
//        } else{
//            System.out.println("Is Meera Array?: false");
//        }

//        int num =22;
//        int response = Solution5.isMeeraNumber(num);
//        if (response == 1) {
//            System.out.println("Is Meera Number?: true");
//        } else{
//            System.out.println("Is Meera Number?: false");
//        }

//        int[] arr ={3, 7, 1, 8, 1};
//        int response = Solution5.isBunker(arr);
//        if (response == 1) {
//            System.out.println("Is Bunker ?: true");
//        } else{
//            System.out.println("Is Bunker ?: false");
//        }

//        int[] arr ={0,-1,2};
//        int response = Solution5.isNiceArray(arr);
//        if (response == 1) {
//            System.out.println("Is Nice Array ?: true");
//        } else{
//            System.out.println("Is Nice Array ?: false");
//        }

        int num = 40;
        int response = Solution5.isContinousFactored(num);
        if (response == 1) {
            System.out.println("Is Continuous Factored?: true");
        } else{
            System.out.println("Is Continuous Factored?: false");
        }

        int[] arr = {1, 17, 8, 25, 19} ;
        int response1 = Solution5.isTwin(arr);
        if (response1 == 1) {
            System.out.println("Is Twin Array?: true");
        } else{
            System.out.println("Is Twin Array?: false");
        }

        int[] arr1 = {9, 1, 12, 1};
        int[] arr2 = {1, 9, 12, 9, 12, 1, 9};
        int response2 = Solution5.isSetEqual(arr1, arr2);
        if (response2 == 1) {
            System.out.println("Is Set Equal?: true");
        } else{
            System.out.println("Is Set Equal?: false");
        }

        int num1 = 2;
        int response3 = Solution5.isSmart(num1);
        if (response3 == 1) {
            System.out.println("Is Smart ?: true");
        } else{
            System.out.println("Is Smart?: false");
        }

        int[] arr3 = {0,2,1,1,1};
        int response4 = Solution5.isNiceArrayAnother(arr3);
        if (response4 == 1) {
            System.out.println("Is Nice Array?: true");
        } else{
            System.out.println("Is Nice Array?: false");
        }

    }
}

