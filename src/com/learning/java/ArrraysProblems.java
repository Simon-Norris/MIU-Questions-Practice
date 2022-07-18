package com.learning.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class ArrayProblems {
    public int peakEl(int[] arr) {
        if (arr == null || arr.length == 0){
            return -1;
        }
        if (arr.length == 1) {
            return 0;
        }
        int max = 0; int peakElement = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                peakElement = i;
            }
        }
        return peakElement;
    }

    public static int[] findMaxMinEl(int[] arr) {
        int max = arr[0], min = arr[0];
        if (arr.length == 1) {
            return  new int[]{min,max};
        }
        for (int i=0; i < arr.length; i++ ){
            if (arr[i] >= max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{min,max};

    }

    public static int[] reverseArray(int[] arr) {
        if (arr.length == 0){
            return new int[]{};
        }
        int[] temp = new int[arr.length];
        int k = 0;
        for(int i = arr.length-1; i >= 0 ; i--){
            temp[k] = arr[i];
            k++;
        }
        return temp;
    }
    public static int[] reverseArrayUsingRecursion(int[] arr, int i, int j) {
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverseArrayUsingRecursion(arr,i+1,j-1);
        }
        return arr;
    }

    public static void sortMerge(int[] arr, int start, int end){
        if (start < end) {
            int mid = start + (end-start)/2;
            sortMerge(arr, start, mid);
            sortMerge(arr, mid+1, end);
            mergeSort(arr, start, end, mid);
        }
    }
    public static void mergeSort(int[] arr, int start, int end, int mid) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int m = start; m <= end; m++) {
            arr[m] = temp[m - start];
        }
    }

    public static void sort012(int[] arr, int length){
        if (length == 0 || length == 1) {
            return;
        }
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i=0; i < length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if ( arr[i] == 1) {
                countOne++;
            } else if (arr[i] == 2){
                countTwo++;
            }
        }
        int k =0;
        for (int i=k; i< countZero; i++){
            arr[i] = 0; k++;
        }
        for(int i=k; i < countZero+countOne; i++){
            arr[i] = 1; k++;
        }
        for(int i=k; i < countZero+countOne+countTwo; i++){
            arr[i] = 2; k++;
        }
    }

    static int[] seperateNumbers(int[] arr, int n){
        int[] positiveArrays = new int[n];
        int[] negativeArrays = new int[n];
        int k=0, j=0;
        for (int i=0; i < n; i++) {
            if (arr[i] >= 0){
                positiveArrays[k] = arr[i];
                k++;
            }  if (arr[i] < 0){
               negativeArrays[j] = arr[i];
               j++;
            }
        }
        for (int begin= k; begin <= positiveArrays.length-1; begin++){
            positiveArrays[begin] = negativeArrays[begin-k];
        }
        return positiveArrays;
    }

    static void doUnion(int[] first, int m, int[] second, int n) {
        int[] temp1 = ArrayProblems.cleanArray(first, m);
        int[] temp2 = ArrayProblems.cleanArray(second, n);
        findUnion(temp1, temp2);
    }
    private static void findUnion(int[] firstArr, int[] secondArr) {
        int i = 0;
        int j = 0;

        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                System.out.print(firstArr[i] + " ");
                i++;
            } else if (secondArr[j] < firstArr[i]) {
                System.out.print(secondArr[j] + " ");
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }

        while (i < firstArr.length) {
            System.out.print(firstArr[i] + " ");
            i++;
        }

        while (j < secondArr.length) {
            System.out.print(secondArr[j] + " ");
            j++;
        }
    }
    static int[] cleanArray(int[] arr, int length){
        if (arr==null || length == 0){
            return new int[]{};
        }
        int[] temp = new int[length];
        int k=1;
        temp[0]= arr[0];
        for(int i=1; i < length; i++){
            if (arr[i] != arr[i-1]) {
                temp[k] = arr[i];
                k++;
            }
        }
        int[] newArr = new int[k];
        for(int i=0; i<k; i++){
            newArr[i] = temp[i];
        }
        return newArr;
    }
}
