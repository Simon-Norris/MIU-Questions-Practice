package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {


        int one = 10;
        int response = Solution8.isPascal(one);
        if (response == 1) {
            System.out.println("Is Pascal Number?: true");
        } else {
            System.out.println("Is Pascal Number?: false");
        }

        int[] arr = {4};
        boolean response2 = Solution8.sumIsPower(arr);
        if (response2) {
            System.out.println("Sum is Power");
        } else {
            System.out.println("Sum is not Power");
        }

    }
}

