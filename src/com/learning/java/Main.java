package com.learning.java;

import java.util.*;
public class Main
{

    public static void main(String[] args) {
        int[] arr1 = {1,4,5,7};
        int[] arr2 = {10,20,30,40};
        int[] holdResult = new int[2];
        int target = 9;
        int[] result = TwoPointers.closePair(arr1,arr2,holdResult,target);
        System.out.printf("The pair are (%s, %s)",result[0],result[1]);
    }
}

