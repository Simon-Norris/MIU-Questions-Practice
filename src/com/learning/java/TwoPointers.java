package com.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {
    /**
     *Given a sorted array and a number x, find a pair in an array whose sum is closest to x.
     * Examples:
     * Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
     * Output: 22 and 30
     * Input: arr[] = {1, 3, 4, 7, 10}, x = 15
     * Output: 4 and 10
     **/
    public static int[] closestSum(int[] arr, int target) {
        if (arr == null || arr.length == 0) return arr;
        Arrays.sort(arr);
        int left = 0, right = arr.length-1, closest=0;
        int[] response = new int[2];
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > target) {
                right--;
            } else {
               if (sum >= closest) {
                   closest = sum;
                   response[0] = arr[left];
                   response[1] = arr[right];
                   left++;
               } else {
                   right--;
               }
            }
        }
        return response;
    }
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

    public static List<List<Integer>> tripletZeroSum (int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> mainList = new ArrayList<>();
        for (int l = 0; l < arr.length; l++) {
            int m = l+1 ,r = arr.length-1;
            while (m < r) {
                int tripleSum = arr[l] + arr[m] + arr[r];
                if (tripleSum < 0) {
                   m++;
                } else if (tripleSum > 0) {
                    r--;
                } else {
                    mainList.add(Arrays.asList(arr[l], arr[m], arr[r]));
                    while (m+1 <= r && arr[m] == arr[m+1]) m++; // skip duplicate element on mid
                    m++; r--;
                }
            }
            while (l+1 < arr.length && arr[l+1] == arr[l]) l++; // skip duplicate element on leftmost
        }
        return mainList;
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
    /**
     * There is an integer array nums sorted in ascending order (with distinct values).
     *
     * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index
     * k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     *
     * Given the array nums after the possible rotation and an integer target, return the index of target
     * if it is in nums, or -1 if it is not in nums.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     * **/
    public static int searchInRotatedArray(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                // left half is monotonic, yet still does not satisfy
                if (nums[start] <= nums[mid] && nums[start] > target) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                // right half is monotonic , yet still does not satisfy
                if (nums[end] >= nums[mid] && nums[end] < target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
