package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

//        int[] arr =  {2, -3, 4, 3, 6} ;
//        int response = Solution6.isComplete(arr);
//        if (response == 1) {
//            System.out.println("Is Complete Array?: true");
//        } else{
//            System.out.println("Is Complete Array?: false");
//        }

        int n=10, m=9;
        int response1 = Solution6.factorEqual(n,m);
        if (response1 == 1) {
            System.out.println("Are Factor Equal?: true");
        } else{
            System.out.println("Are Factor Equal?: false");
        }

        int[] arr2 =  {-4, 0, 1, 0, 2, 1} ;
        int response2 = Solution6.isMeera(arr2);
        if (response2 == 1) {
            System.out.println("Is Meera Array?: true");
        } else{
            System.out.println("Is Meera Array?: false");
        }

        int[] arr3 =  {3, 1, 2, 1, 3, 1, 3, 2, 2};
        int response3 = Solution6.isTriple(arr3);
        if (response3 == 1) {
            System.out.println("Is Triple Array?: true");
        } else{
            System.out.println("Is Triple Array?: false");
        }

        int n1=44;
        int response4 = Solution6.isFibonacci(n1);
        if (response4 == 1) {
            System.out.println("Is fibonacci ?: true");
        } else{
            System.out.println("Is fibonacci?: false");
        }

        int[] arr4 =  {3, 1, 6, 1, 3, 1, 3, 2, 2};
        int re5 = Solution6.isBeanArray(arr4);
        if (re5 == 1) {
            System.out.println("Is Bean Array?: true");
        } else{
            System.out.println("Is Bean Array?: false");
        }

        int num = 22;
        int re = Solution6.isFancyArray(num);
        if (re == 1) {
            System.out.println("Is Fancy Num?: true");
        } else{
            System.out.println("Is Fancy Num?: false");
        }

        int num1 = 22;
        int re1 = Solution6.isBunker(num1);
        if (re1 == 1) {
            System.out.println("Is Bunker Num?: true");
        } else{
            System.out.println("Is Bunker Num?: false");
        }

        int[] arr5 = {-2, -4, -6, -8, -11};
        int re4 = Solution6.isOddHeavy(arr5);
        if (re4 == 1) {
            System.out.println("Is Odd Heavy Array ?: true");
        } else{
            System.out.println("Is Odd Heavy Array ?: false");
        }

        int numb = 8;
        int re3 = Solution6.isNormal(numb);
        if (re3 == 1) {
            System.out.println("Is Normal Num?: true");
        } else{
            System.out.println("Is Normal Num?: false");
        }

    }
}

