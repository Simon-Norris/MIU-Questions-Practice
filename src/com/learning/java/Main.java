package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] result = Solution11.solve10();
        System.out.println("The solution of solve10 are x: "+ result[0] +" and y: " +result[1]);

        int[] arr1 = {0, 3, 2, 0, 5, 3};
        int n1 = 32053;
        System.out.println("Is reps equal ? "+Solution11.repsEqual(arr1, n1));

        int i = 1;
        int j = 2;
        System.out.println("The henry sum is: " +Solution11.henry(i,j));

        int[] arr4 = {24};
        int diviosr = 12;
        System.out.println("Is array divisble by divisor ?: "+Solution11.isDivisible(arr4,diviosr));

        int[] arr5 ={7, 3, 3, 2, 4} ;
        int n5 = 6;
        System.out.println("Is array nUnique ?: "+Solution11.nUnique(arr5,n5));
    }
}

