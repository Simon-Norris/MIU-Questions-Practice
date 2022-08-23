package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {


        int[] arr =  {2} ;
        int response = Solution7.isCentered(arr);
        if (response == 1) {
            System.out.println("Is Centered Array?: true");
        } else{
            System.out.println("Is Centered Array?: false");
        }


        int[] arr1 = {1, 2, 2, 1, 3, 0};
        int response1 = Solution7.isDual(arr1);
        if (response1 == 1) {
            System.out.println("Is Dual Array?: true");
        } else{
            System.out.println("Is Dual Array?: false");
        }

        int[] arr2 = {1, 5, 0, 2, 3, 4};
        int response2 = Solution7.isAllPossibilities(arr2);
        if (response2 == 1) {
            System.out.println("Is an array of all possibilities?: true");
        } else{
            System.out.println("Is an array of all possibilities ?: false");
        }


    }
}

