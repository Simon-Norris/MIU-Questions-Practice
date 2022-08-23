package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {

        int[] arr =  {2, -3, 4, 3, 6} ;
        int response = Solution6.isComplete(arr);
        if (response == 1) {
            System.out.println("Is Complete Array?: true");
        } else{
            System.out.println("Is Complete Array?: false");
        }

    }
}

