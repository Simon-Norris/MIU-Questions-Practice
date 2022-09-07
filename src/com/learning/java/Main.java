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

        int n6 = 0;
        System.out.println("Is Square?: "+Solution11.isSquare(n6));

        int base = 2;
        int[] a7 = {1,0,1,1};
        System.out.println("Is Legal Number?: "+Solution11.isLegalNumber(a7, base));

        int base1 = 2;
        int[] a8 = {1,0,1,1};
        System.out.println("The result after converted base to 10 is: "+Solution11.convertToBase10(a8, base1));

        int num= 25;
        System.out.println("The computed depth is: "+Solution11.computeDepth(num));

        int[] a9 = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p9 = {3, -2, 3};
        System.out.println("Does the array matches ? "+Solution11.matches(a9, p9));
    }
}

