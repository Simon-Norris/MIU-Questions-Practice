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

        int num3 = 17;
        System.out.println("\nIs given number palindrome or not ? "+Miscellaneous.isPalindrome(num3));

        int num4 = 37;
        System.out.println("\nIs given number square root or not ? "+Miscellaneous.isSquareRoot(num4));

        int a1 = 13, b1 = 145;
        System.out.println("Before Swapping: a = "+a1+" and b = "+b1);
        int[] res1 = Miscellaneous.swapWithoutThirdVariable(a1, b1);
        System.out.println("After Swapping: a = "+res1[0]+" and b = "+res1[1]);

        System.out.println("Prime number from 1 to 100 are as follows");
        for (int i = 1; i <= 100; i++) {
            if (Miscellaneous.isPrime(i)) System.out.print(i+" ");
        }

        System.out.println();

        int n69 = 6;
        System.out.println("Using while factorial: "+Miscellaneous.recursionFactorial(n69));

        int n70 = 12345;
        System.out.println("The reverse of the given number is: "+Miscellaneous.reverseNumber(n70));

        int n71= 7;
        System.out.println("The fibonacci sequence are as follows: ");
        Miscellaneous.fib(n71);
        System.out.println();

        int n72 = 50;
        int n73 = 80;
        System.out.println("The gcd between two numbers is: "+Miscellaneous.gcd(n72, n73));
        System.out.println("Alternate The gcd between two numbers is: "+Miscellaneous.gcdAlternateWay(n72, n73));

        int n74 = 1634;
        System.out.println("Is Armstrong number ? "+Miscellaneous.isArmstrongNumber(n74));

        Miscellaneous.floydTriangle(6);
        Miscellaneous.pascalTriangle(6);
    }
}

