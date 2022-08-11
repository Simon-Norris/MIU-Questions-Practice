package com.learning.java;

public class TwoPointers {
    /** Find the closest pair from two sorted Arrays
     * Given two sorted arrays and number X. Find the pair whose sum is closest to X
     * and the pair has an element from each array.
     * Input: arr1= {1,4,5,7}, arr2={10,20,30,40}
     * X = 32
     * Output = 1 and 30.
     * X = 50
     * Output = 7 and 40.
     **/
    public static int[] closePair (int[] arr1, int[] arr2, int[] result, int target) {
        if (arr1 == null || arr1.length == 0 || arr2==null || arr2.length == 0) return result;
        int arr1Pointer =0, arr2Pointer=arr2.length-1, closeValue=Integer.MIN_VALUE;
        while (arr1Pointer < arr1.length && arr2Pointer >= 0) {
            int pairSum = arr1[arr1Pointer]+arr2[arr2Pointer];
            if (pairSum > target) { // if sum of pair is greater than target reduce second array pointer
                arr2Pointer--;
            } else {
                if (pairSum > closeValue) { // if sum of pair is greater than the closest value
                    closeValue = pairSum;
                    result[0] = arr1[arr1Pointer];
                    result[1] = arr2[arr2Pointer];
                    // since the array is sorted i.e all the values left from the pointer in second array are less, it is useless to traverse.
                    // Therefore increase the pointer value in first array and reset the pointer in second array back to rightmost value.
                    arr1Pointer++;
                    arr2Pointer=arr2.length-1;
                } else {
                    arr2Pointer--;
                }
            }
        }
        return result;
    }
    /**
     * Given n non-negative integers representing an elevation map where the width of each bar is 1,
     * compute how much water it can trap after raining.
     * Input: height = [4,2,0,3,2,5]
     * Output: 9
     * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * Output: 6
     * **/
    public static int trapRainWater(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int left=0, right=arr.length-1, leftMax=0, rightMax=0, trappedWater=0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    trappedWater += leftMax-arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    trappedWater += rightMax-arr[right];
                }
               right-- ;
            }
        }
        return trappedWater;
    }
}
