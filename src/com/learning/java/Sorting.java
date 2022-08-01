package com.learning.java;

public class Sorting {
    /** 1. Start iteration from 1 as the single element is assumed to be sorted always
     *  2. Take the first element from unsorted sub array ( currentValue = arr[i] )
     *  3. Take the last element from the sorted sub array ( j = i-1 )
     *  4. While the last elements from the sorted sub array is greater than the current value
     *      move those elements their one step ahead ahead their current position.
     *  5. Insert the current value at its position in sorted sub array ( j+1 ).
     **/
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i=1;i< arr.length;i++) {
           int currentValue = arr[i];
           int j = i-1;
           while (j >= 0 && arr[j] > currentValue) {
               arr[j+1] = arr[j];
               j = j-1;
           }
           arr[j+1] = currentValue;
        }
    }
    public static void insertionSortDescending(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i=1; i< arr.length; i++) {
            int currentValue = arr[i];
            int j = i-1;
            while (j >= 0 && currentValue > arr[j]) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = currentValue;
        }
    }
}
