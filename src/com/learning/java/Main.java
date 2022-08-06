package com.learning.java;

import java.util.*;
public class Main
{
    public static void main(String[] args) {

        // reverse the integer number

        //int result = Recursion.rev(123, 0);
        //System.out.println(result);

        //convert digits to words
        //Recursion.digitToWords(987654321);

        // find power of numbers
        /*int num = 4;
        int pow = 3;
        int res = Recursion.pow(num,pow);
        System.out.printf("The power of %s to %s is %s ", num, pow, res);*/

        // find the arithmetic sum from 1 to N
        /*int result = Recursion.arithmeticSum(25,1);
        System.out.print(result);*/

        //System.out.println(15 / 18);
        /*int gcd = Recursion.euclidGCD(18,12);
        System.out.println(gcd);*/

        // convert decimal number to binary number
        /*int decimalToBinary = Recursion.decimalToBinary(25);
        System.out.println(decimalToBinary);*/

        int[] arr = { 1, 9, 2, 32, 8, 76, 34, 12};
        /*ArrayProblems arrayProblems = new ArrayProblems();
        int result = arrayProblems.peakEl(arr);
        System.out.print("Peak element index is: "+result);*/

        // finding max and min element in an array
        /*int[] response = ArrayProblems.findMaxMinEl(arr);
        System.out.println("Minimum element is: "+response[0]);
        System.out.println("Maximum element is: "+response[1]);*/

        // Reverse an array
       /* System.out.println("The reverse array is below");

        // i. Iteration
        *//*int[] response = ArrayProblems.reverseArray(arr);*//*

        // ii. Recursion
        int[] response = ArrayProblems.reverseArrayUsingRecursion(arr,0,arr.length -1);

        for (int j : response) {
            System.out.println(j);
        }*/

        // sort an array using merge sort

        /*ArrayProblems.sortMerge(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }*/

        // sort the 0s 1s 2s
        /*int[] arr012 = {1,2,1,2,0,2,2,1,0};
        ArrayProblems.sort012(arr012,9);
        for(int i : arr012) {
            System.out.println(i);
        }*/
        /*int[] newAr = {1,-1,3,2,0,-7,-5,11,6};
        int[] result = ArrayProblems.seperateNumbers(newAr,8);
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }*/

        // find unions of an array
//        int[] first ={1,2,2,2,3,3,3,3,3,3,4,4,5,6,6,7,7,8};
//        int[] second ={3,3,3,3,4,4,5,6,6,7,7,8,9,9,9,9,9,9,10,12,24,25,25};
//        ArrayProblems.doUnion(first, first.length, second, second.length);
//
//        // Finding maximum element in an array
//        System.out.print("Maximum element in an array is " + Recursion.findMaxElement(arr, arr.length, arr[0]));

        // binary search using recursion
//        System.out.print("Before Sorting\n");
//        for (int i=0; i< arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int i=1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i-1;
//            while(j >= 0 && arr[j] > key) {
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//        }
//        System.out.print("\nAfter Sorting\n");
//        for (int i=0; i< arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print("\nThe element lies at index: "+Recursion.binarySearch(arr, 0, (arr.length-1), 76));

        // product of two numbers using recursion
        //System.out.print("The product is: "+Recursion.productOfTwoNumbers(12,7));

        // Sum of two numbers using recursion
        //System.out.print("The product is: "+Recursion.sumOfTwoNumbers(-10,240));

        //Reverse an array
        Recursion.reverseArray(arr, 0, arr.length-1);
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print Fibonacci Sequence
        int n = 10;
        for (int i=0; i< n; i++) {
            System.out.print(Recursion.fibonacciSequence(i)+ " ");
        }
    }
}

