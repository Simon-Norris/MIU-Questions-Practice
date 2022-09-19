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

        int n5 = 4;
        System.out.println("Is triangular ?: "+Solution14.isTriangular(n5));

        int[] a6= {2,3,3,4,4,4,4,4,3,1} ;
        System.out.println("Is mercurial array ? "+Solution14.isMercurial(a6));

        int n7 = 13;
        System.out.println("Is Fibonacci Number ? "+Solution14.isFibonacci(n7));

        int n8 = 125;
        System.out.println("Is vesuvian number ? "+Solution14.isVesuvian(n8));

        int[] arr9 = {1,1,4,5,4,4,1,1};
        System.out.println("Is oneBalanced array ? "+Solution14.isOneBalanced(arr9));

        int n10 = 12;
        System.out.println("The closest fibonacci number is : " +Solution14.closestFibonacciNumber(n10));

        char[] ch1 = {'b', 'o', 'g'};
        char[] ch2 = {'b', 'o', 'm'};
        System.out.println("Are these char arrays anagrams ? "+Solution14.areAnagrams(ch1, ch2));

        int n12 = 127;
        System.out.println("Is this number hodder ? "+Solution14.isHodder(n12));

        int[] a13 = {-2, 3, 4, 9};
        System.out.println("The largest difference between evens is: "+Solution14.largestDifferenceOfEvens(a13));

        int n14 = 13;
        System.out.println("Is prime factorial ? "+Solution14.isFactorialPrime(n14));

        int[] arr15 = {1, 1, 2, 1, 2, 3};
        System.out.println("Is this systematically increasing array ? "+ Solution14.systematicallyIncreasing(arr15));

        int n16 = 563;
        int[] res16 = Solution14.encodeArray(n16);
        System.out.println("The encoded array is: ");
        for (int i = 0; i < res16.length; i++) {
            System.out.print(res16[i]+" ");
        }
    }
}

