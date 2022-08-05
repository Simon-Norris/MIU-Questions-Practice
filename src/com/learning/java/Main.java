package com.learning.java;

import java.util.*;
public class Main
{

    public static void main(String[] args) {

        int[] arr = {5,2,4,6,7,1,3,2,4,9};
        //  ascending order insertion sort
        //  Sorting.insertionSort(arr);

        // descending order insertion sort
//        Sorting.insertionSortDescending(arr);
//        for (int i=0; i< arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        // Sorting using quick sort algorithm
        Sorting.quickSort(arr,0, arr.length-1);
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

