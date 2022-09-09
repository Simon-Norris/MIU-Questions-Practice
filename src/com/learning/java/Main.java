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

        int n6 = 12;
        System.out.println("The number of ways given rupee can be representated is: "+Solution12.countRepresentations(n6));

        int[] a7 = {2, 3, 3, 99, 99, 99, 99, 99} ;
        System.out.println("Is array sequentially bounded ? "+Solution12.sequentiallyBounded(a7));

        int[] a8 = {18, 3, 4, 0, 1} ;
        System.out.println("Is array min max  jointed ? "+Solution12.minMaxDisjoint(a8));

        int n9 = 124;
        System.out.println("The count of smallest is: "+Solution12.smallest(n9));

        int[] arr10 = {2, 1, 2, 1, 5, 1, 1, 1, 1, 1, 1, 2}  ;
        int[] res10 = Solution12.clusterCompression(arr10);
        if (res10 == null || res10.length == 0) System.out.println("null | empty");
        else {
            System.out.println("The cluster compression arr is");
            for (int j : res10) {
                System.out.print(j+ " ");
            }
        }
    }
}

