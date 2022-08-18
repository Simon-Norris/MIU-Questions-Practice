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

        int num = 90;
        int re = Solution3.isConsecutiveFactored(num);
        if (re == 1){
            System.out.print("Array is Consecutive Factored.");
        } else {
            System.out.print("Array is not Consecutive Factored!");
        }

    }
}

