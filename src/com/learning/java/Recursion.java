package com.learning.java;

public class Recursion {

    public static int decimalToBinary(int num){
        if (num == 0) {
            return num;
        }
        int result = num % 2;
        int sum = 10 * decimalToBinary(num/2);
        return result + sum;

    }
    public static int euclidGCD(int num1, int num2){
        if (num1 !=0 && num2 == 0){
            return num1;
        }
        if (num1 == 0 && num2 !=0){
            return num2;
        }
        int remainder = num1 % num2;
        return euclidGCD(num2, remainder);
    }
    public static int arithmeticSum(int n, int d){
        if (d == 0 || n == 1){
            return n;
        }
        int sum = 1 + (n-1) * d;
        return sum + arithmeticSum(n-1, d);
    }
    public static int pow(int num, int pow){
        if (num <= 0){
            return 0;
        }
        if (pow == 0){
            return 1;
        }
        return num * pow(num, pow-1);

    }
    public static void printWords(int num){
        if (num ==0) {
            System.out.println("Zero");
        }
        if (num == 1 ) {
            System.out.println("One");
        }
        if (num == 2 ) {
            System.out.println("Two");
        }
        if (num == 3 ) {
            System.out.println("Three");
        }
        if (num == 4 ) {
            System.out.println("Four");
        }
        if (num == 5 ) {
            System.out.println("Five");
        }
        if (num == 6 ) {
            System.out.println("Six");
        }
        if (num == 7 ) {
            System.out.println("Seven");
        }
        if (num == 8 ) {
            System.out.println("Eight");
        }
        if (num == 9) {
            System.out.println("Nine");
        }
    }
    public static void digitToWords(int num){
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (num == 0){
            return;
        }
        int result = num%10;
        digitToWords(num/10);
        System.out.print(words[result] + " ");
        //printWords(result);
    }
    public static int rev(int num, int result){
        if (num == 0) {
            System.out.println("which went");
            return result;
        }
        result = (result*10) + num%10;
        int nice = rev(num/10, result);
        System.out.println(nice);
        return nice;
    }
    public static int findMaxElement(int[] arr, int length, int max) {
        if (length == 1) {
            return max;
        }
        int num = arr[length-1];
        if (num > max) {
            max = num;
        }
        return findMaxElement(arr, length-1, max);
    }
    public static int binarySearch(int[] arr, int start, int end, int valueToFind) {
        if (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == valueToFind) return mid;
            else if (arr[mid] > valueToFind) return binarySearch(arr, start, mid-1, valueToFind);
            else if (arr[mid] < valueToFind) return binarySearch(arr, mid+1, end, valueToFind);
        }
        return -1;
    }

}
