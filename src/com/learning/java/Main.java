package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] arr1 = {5,-5,0};
        System.out.println("Is Sum Safe ? "+Solution12.isSumSafe(arr1));

        int n2 = 7;
        System.out.println("Is stacked "+Solution12.isStacked(n2));

        int[] arr3 = {1};
        System.out.println("Is array vanilla ? "+Solution12.isVanilla(arr3));

        long n4 = 21;
        System.out.println("Is num isolated ? "+Solution12.isIsolated(n4));

        int[] a5 = {-1, 1, 1, 0} ;
        System.out.println("Is trivalent array ? "+Solution12.isTriValent(a5));
    }
}

