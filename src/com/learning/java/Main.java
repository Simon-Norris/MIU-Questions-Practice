package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 0, 3, 4};
        System.out.println("Is railRoad Tie ? "+Solution13.isRailRoadTie(arr1));

        int n2 = 94;
        System.out.println("The number of fullness quotient are: "+Solution13.fullnessQuotient(n2));

        int[] arr3 ={0,0} ;
        System.out.println("Is packed: "+Solution13.isPacked(arr3));

        int[] arr4 ={2,5,3};
        System.out.println("Is Odd Heavy: "+Solution13.isOddHeavy(arr4));

        int n = 128;
        int p = 4;
        System.out.println("The largest exponent is: "+Solution13.getExponent(n, p));
    }
}

