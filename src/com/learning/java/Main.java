package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] result = Solution11.solve10();
        System.out.println("The solution of solve10 are x: "+ result[0] +" and y: " +result[1]);

        int[] arr1 = {0, 3, 2, 0, 5, 3};
        int n1 = 32053;
        System.out.println("Is reps equal ? "+Solution11.repsEqual(arr1, n1));

        int i = 1;
        int j = 5;
        System.out.println("The henry sum is: " +Solution11.henry(i,j));
    }
}

