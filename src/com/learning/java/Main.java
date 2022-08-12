package com.learning.java;

import java.util.*;
public class Main
{

    public static void main(String[] args) {
//        int[] arr1 = {1,4,5,7};
//        int[] arr2 = {10,20,30,40};
//        int[] holdResult = new int[2];
//        int target = 9;
//        int[] result = TwoPointers.closePair(arr1,arr2,holdResult,target);
//        System.out.printf("The pair are (%s, %s)",result[0],result[1]);
//
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
//
//        System.out.println("Trapped Rain Water is: "+TwoPointers.trapRainWater(arr));

        int[] arr = {10, 22, 28, 29, 30, 40};
        int[] res = TwoPointers.closestSum(arr,31);
        System.out.printf("The pair equal to target are: %s and %s.",res[0],res[1]);
    }
}

