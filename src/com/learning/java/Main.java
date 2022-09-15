package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};
        int n1 = 2;
        System.out.println("Before doing n based integer rounding:");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+ " ");
        }
        System.out.println();
        Solution14.doIntegerBasedRounding(a1, n1);
        System.out.println("After doing n based integer rounding:");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+ " ");
        }
        System.out.println();


        int n2= -81;
        System.out.println("Is cube powerful ? "+Solution14.isCubePowerful(n2));

        int[] a2 = {1, 1};
        System.out.println("THe decoded number from array is: "+Solution14.decodeArray(a2));

        int[] a3 = {} ;
        System.out.println("Is array Zero plentiful ?: "+Solution14.isZeroPlentiful(a3));

        int[] a4 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Is 235Array ? "+Solution14.is235Array(a4));
    }
}

