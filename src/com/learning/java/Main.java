package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {
        int num1= 10;
        int num2 = 11;
        System.out.println("The sum of two binary numbers is: "+Miscellaneous.addBinary(num1, num2));

        int hex = 1256;
        System.out.println("The converted hex num is: "+Miscellaneous.convertToHex(hex));

        int num = 5;
        System.out.println("The n sequence sum n+nn+nnn is: "+Miscellaneous.nSequenceSum(num));

        int seconds = 7320;
        System.out.println("The converted second int HMS is "+Miscellaneous.secondToHMS(seconds));

        int[] arr = {20, 30, 40};
        int n = 1;
        System.out.printf("Before rotating given array %s place",n);
        System.out.println();
        for (int j : arr) {
            System.out.print(j +" ");
        }
        System.out.printf("\nAfter rotating given array %s place",n);
        Miscellaneous.rotateArray(arr, n);
        System.out.println();
        for (int j : arr) {
            System.out.print(j+" ");
        }

        int[] first = {1, 3, -5, 4};
        int[] second = {1, 4, -5, -2};
        System.out.println("\nAfter multiplying two arrays");
        int[] response = Miscellaneous.multiplyTwoArr(first, second);
        for (int i = 0; i < response.length; i++) {
            System.out.print(response[i]+" ");
        }

        int[] a = {3,4,5,6,7,8,9,10,11,12,13,14,115};
        int[] b ={1,2,3,4,5,6,7,24,67,89,114,170};
        System.out.println("\nAfter sorting");
        int[] res = Miscellaneous.mergeSortedArrays(a, b);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}

