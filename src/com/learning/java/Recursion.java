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
    public static int productOfTwoNumbers(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if ( min == 0) {
            return 0;
        }
        return max + productOfTwoNumbers(min-1, max);
    }

    public static int sumOfTwoNumbers (int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if ( min == 0) {
            return max;
        } else if (min < 0) {
            return max+min;
        }
        return 1 + sumOfTwoNumbers(min-1, max);
    }

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left+1, right-1);
    }
    public static int fibonacciSequence(int num) {
        if (num == 0 || num==1) {
            return num;
        }
        return fibonacciSequence(num-2) + fibonacciSequence(num-1);
    }
    public static  void findPermutation(String str) {
        if (str.length() == 0)  {
            return;
        }
        permute(str.toCharArray(), 0);
    }
    private static void permute(char[] chars, int currentIndex) {
        if (currentIndex == chars.length-1) {
            String idk = String.valueOf(chars);
            System.out.println(idk);
        }
        for (int i=currentIndex; i< chars.length; i++) {
            swap(chars, currentIndex, i); // do swap
            permute(chars, currentIndex+1);
            swap(chars, currentIndex, i); // undo swap
        }
    }
    private static void swap(char[] chars, int first, int second) {
        char temp = chars[first];
        chars[first] = chars[second];
        chars[second] = temp;
    }
}
