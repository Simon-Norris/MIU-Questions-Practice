package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {



        int[] arr = {2,3,5,11} ;
        int response1 = Solution9.isSuper(arr);
        if (response1 == 1) {
            System.out.println("Is Super Array?: true");
        } else {
            System.out.println("Is Super Array?: false");
        }

        int[] arr2 =  {2, 7, 8, 9, 11, 13, 10} ;
        int response2 = Solution9.isSym(arr2);
        if (response2 == 1) {
            System.out.println("Is Sym Array?: true");
        } else {
            System.out.println("Is Sym Array?: false");
        }

        int response3 = Solution9.factorTwoCount(27);
        System.out.print("Factor 2 count of given n is: "+response3);

        int num = 24 ;
        int response4 = Solution9.isConsecutiveFactored(num);
        if (response4 == 1) {
            System.out.println("Is Consecutive Factored?: true");
        } else {
            System.out.println("Is Consecutive Factored?: false");
        }

        int[] arr4 = {9,9,9,9,9,9,9,9,9,9};
        int miles = 9;
        Solution9.updateMileageCounter(arr4, miles);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        double num6 = 2.0;
        int[] arr6 = {4, 0, 9};
        double response6 = Solution9.eval(num6,arr6);
        System.out.print("Value of the polynomial is: "+response6);
    }
}

