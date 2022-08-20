package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18};
//        int re = Solution3.hollowArray(arr);
//        if (re == 1){
//            System.out.print("Array is hollow");
//        } else {
//            System.out.print("Array is not hollow!");
//        }

//        int num = 90;
//        int re = Solution3.isConsecutiveFactored(num);
//        if (re == 1){
//            System.out.print("Number is Consecutive Factored.");
//        } else {
//            System.out.print("Number is not Consecutive Factored!");
//        }

//        int num = 3;
//        int re = Solution3.isTwinPrime(num);
//        if (re == 1){
//            System.out.print("Number is twin primed.");
//        } else {
//            System.out.print("Number is not twine primed!");
//        }

//        int[] arr = {1, 2, 3, 4}  ;
//        System.out.println("The largest adjacent sum is: "+ Solution3.largestAdjacentSum(arr));

//        int[] arr = {} ;
//        int re = Solution3.isZeroBalanced(arr);
//        if (re == 1){
//            System.out.print("Number is Zero Balanced.");
//        } else {
//            System.out.print("Number is not Zero Balanced!");
//        }

//        System.out.println("Smallest BEQ number is "+Solution3.findSmallestBEQNumber());

        int[] arr = {-27,24}    ;
        int re = Solution3.isCubePerfect(arr);
        if (re == 1){
            System.out.print("Array is Cube Perfect");
        } else {
            System.out.print("Array is not Cube Perfect");
        }
    }
}

