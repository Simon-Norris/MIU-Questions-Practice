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

    }
}

