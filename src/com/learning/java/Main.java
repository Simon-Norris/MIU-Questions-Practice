package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {



        int[] arr = {2,3,5,11} ;
        int response1 = Solution9.isSuper(arr);
        if (response1 == 1) {
            System.out.println("Is Super Array?: true");
        } else {
            System.out.println("Is Super Array?: false");
        }

        int[] arr2 =  {2, 7, 8, 9, 11, 13, 10} ;
        int response2 = Solution9.isSym(arr2);
        if (response2 == 1) {
            System.out.println("Is Sym Array?: true");
        } else {
            System.out.println("Is Sym Array?: false");
        }

        int response3 = Solution9.factorTwoCount(27);
        System.out.print("Factor 2 count of given n is: "+response3);

        int num = 24 ;
        int response4 = Solution9.isConsecutiveFactored(num);
        if (response4 == 1) {
            System.out.println("Is Consecutive Factored?: true");
        } else {
            System.out.println("Is Consecutive Factored?: false");
        }

        int[] arr4 = {9,9,9,9,9,9,9,9,9,9};
        int miles = 9;
        Solution9.updateMileageCounter(arr4, miles);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        double num6 = 2.0;
        int[] arr6 = {4, 0, 9};
        double response6 = Solution9.eval(num6,arr6);
        System.out.print("Value of the polynomial is: "+response6);


        System.out.println();
        int[] arr8 =  {10, 10, 10, 10, 10, 10, 10} ;
        int response8 = Solution9.allValuesTheSame(arr8);
        if (response8 == 1) {
            System.out.println("All values Same?: true");
        } else {
            System.out.println("All values Same?: false");
        }

        int[] arr9 = {1, 2, 3} ;
        int num9 = 2;
        int response9 = Solution9.loopSum(arr9, num9);
        System.out.print("Sum of loop is: "+response9);

        System.out.println();
        int num10 = 82;
        int response10 = Solution9.isSquare(num10);
        if (response10 == 1) {
            System.out.println("Is Square?: true");
        } else {
            System.out.println("Is Square?: false");
        }

        System.out.println();
        int[] arr11 = {3, 2, 4, 1, 5, 6} ;
        int response11 = Solution9.isComplete(arr11);
        if (response11 == 1) {
            System.out.println("Is Complete?: true");
        } else {
            System.out.println("Is Complete?: false");
        }

        System.out.println();
        int[] arr12 = {3,2};
        int[] response12 = Solution9.pairwiseSum(arr12);
        System.out.print(" The pairwise sum is: ");
        assert response12 != null;
        for (int j : response12) {
            System.out.print(j + " ");
        }

        System.out.println();
        int[] arr13 = {1, 1, 1, 1, 1, 1, 2}  ;
        int num13 = 2;
        int response13 = Solution9.isNPrimeable(arr13, num13);
        if (response13 == 1) {
            System.out.println("Is Prime Able?: true");
        } else {
            System.out.println("Is Prime Able?: false");
        }

        System.out.println();
        int seconds = 60;
        int[] res = Solution9.computeHMS(seconds);
        System.out.println("The computed HMS of given n is:\n "+"H: "+res[0]+"\nM: "+res[1]+"\n S: "+res[2]);

        System.out.println();
        int[] arr14 ={1, 2, 1, 2, 1, 2, 1, 2, 1} ;
        //int[] arr14 ={1} ;
        int response14 = Solution9.isMartian(arr14);
        if (response14 == 1) {
            System.out.println("Is Martian Array?: true");
        } else {
            System.out.println("Is Martian Array?: false");
        }

        System.out.println();
        int[] arr15 = {1, 4, 1, 4, 5, 6}  ;
        int num15  = 5;
        int response15 = Solution9.isPaired(arr15, num15);
        if (response15 == 1) {
            System.out.println("Is Paired Array?: true");
        } else {
            System.out.println("Is Paired Array?: false");
        }

        System.out.println();
        int[] n16 = { 4, 6}  ;
        int response16 = Solution9.allEven(n16);
        if (response16 == 1) {
            System.out.println("All Even?: true");
        } else {
            System.out.println("All Even?: false");
        }
    }
}

