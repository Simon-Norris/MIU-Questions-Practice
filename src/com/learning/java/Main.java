package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
        int num = 10;
        int response7 = Solution10.hasNValues(arr, num);
        if (response7 == 1) {
            System.out.println("Has N values?: true");
        } else {
            System.out.println("Has N values?: false");
        }

        int n = 6;
        System.out.println("The next perfect square is: "+Solution10.nextPerfectSquare(n));

        int[] a =  {2, 3, 1, -6, 8, -3, -1, 2};
        int n3 = 5;
        System.out.println("The total nUpCount is: "+Solution10.nUpCount(a, n3));

        int start = -10, end = 6;
        System.out.println("The total prime count from start to end is: "+Solution10.primeCount(start, end));

        int[] arr5 =  {2, 12, 4, 6, 8, 11};

        System.out.println("Is it inertial Array ? 1 means true: 0 means false: "+Solution10.isInertial(arr5));
    }
}

