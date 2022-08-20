package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

//        int n = 99;
//        System.out.println("Is prime Product ? : "+Solution4.isPrimeProduct(n));

        int[] arr =  {6, 7, 2, 3, 12};
        int response = Solution4.isBalanced(arr);
        if (response == 1) {
            System.out.println("Array is Balanced");
        } else {
            System.out.println("Array is not Balanced");
        }
    }
}

