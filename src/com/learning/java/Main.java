package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

//        int n = 99;
//        System.out.println("Is prime Product ? : "+Solution4.isPrimeProduct(n));

//        int[] arr =  {6, 7, 2, 3, 12};
//        int response = Solution4.isBalanced(arr);
//        if (response == 1) {
//            System.out.println("Array is Balanced");
//        } else {
//            System.out.println("Array is not Balanced");
//        }

//        int[] arr =   {9} ;
//        int response = Solution4.isCentered(arr);
//        if (response == 1) {
//            System.out.println("Array is Centered");
//        } else {
//            System.out.println("Array is not Centered");
//        }

//        int m=4,n=6;
//        boolean response = Solution4.hasKSmallFactors(m,n);
//        if (response) {
//            System.out.println("Has K Small Factors");
//        } else {
//            System.out.println("Doesn't have k small factors");
//        }

//        int[] arr = {1, 0, 5, -1, 0, 2, 3, 0, 8};
//        int response = Solution4.isZeroLimited(arr);
//        if (response == 1) {
//            System.out.println("Array is Zero Limited");
//        } else {
//            System.out.println("Array isn't Zero Limited");
//        }


//        int[] arr = {4, 2, -3, 12};
//        int k =0;
//        int n =5;
//        int[] response = Solution4.fill(arr,k,n);
//        if (response != null) {
//            for (int i = 0; i < response.length; i++) {
//                System.out.print(response[i] + " ");
//            }
//        } else{
//            System.out.print(response);
//        }
//
//        int num = 11;
//        System.out.println("The minimum distance between the factors of given number is: "+Solution4.minDistance2(num));

//        int[] arr = {4,1,1,1};
//        int response = Solution4.isWave(arr);
//        if (response == 1) {
//           System.out.println("Is Wave Array?: true");
//        } else{
//            System.out.println("Is Wave Array?: false");
//        }


        int[] arr ={ 9, 6, 18};
        int response = Solution4.isBean(arr);
        if (response == 1) {
           System.out.println("Is Bean Array?: true");
        } else{
            System.out.println("Is Bean Array?: false");
        }
    }
}

