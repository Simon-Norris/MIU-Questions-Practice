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
    }
}

