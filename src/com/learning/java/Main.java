package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {
        int digit = 6;
        int n = 333333123;
        System.out.printf("The number of %s in %s is %s ", digit, n, Solution5.countDigit(n, digit));
        System.out.println();

        int[] arr ={4, 9, 6, 15, 21};
        int response = Solution5.isBunkerArray(arr);
        if (response == 1) {
            System.out.println("Is Bunker Array?: true");
        } else{
            System.out.println("Is Bunker Array?: false");
        }

    }
}

