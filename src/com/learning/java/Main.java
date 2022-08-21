package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

//        int n = 99;
//        System.out.println("Is prime Product ? : "+Solution4.isPrimeProduct(n));

//        int[] arr =  {6, 7, 2, 3, 12};
//        int response = Solution4.isBalanced(arr);
//        if (response == 1) {
//            System.out.println("Array is Balanced");
//        } else {
//            System.out.println("Array is not Balanced");
//        }

//        int[] arr =   {9} ;
//        int response = Solution4.isCentered(arr);
//        if (response == 1) {
//            System.out.println("Array is Centered");
//        } else {
//            System.out.println("Array is not Centered");
//        }

//        int m=4,n=6;
//        boolean response = Solution4.hasKSmallFactors(m,n);
//        if (response) {
//            System.out.println("Has K Small Factors");
//        } else {
//            System.out.println("Doesn't have k small factors");
//        }

        int[] arr = {1, 0, 5, -1, 0, 2, 3, 0, 8};
        int response = Solution4.isZeroLimited(arr);
        if (response == 1) {
            System.out.println("Array is Zero Limited");
        } else {
            System.out.println("Array isn't Zero Limited");
        }
    }
}

