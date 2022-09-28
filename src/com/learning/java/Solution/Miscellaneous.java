package com.learning.java.Solution;

import java.util.concurrent.TimeUnit;

public class Miscellaneous {

    public static int addBinary(int first, int second) {
        int sum = convertToDecimal(first) + convertToDecimal(second);
        return toBinary(sum);
    }

    private static int convertToDecimal(int n) {
        int num = n, sum = 0;
        int count = 0;
        while (num != 0) {
            int r = num % 10;
            int val = r * power(2, count);
            sum += val;
            count++;
            num = num / 10;
        }
        return sum;
    }

    private static int power(int x, int y) {
        int res = 1;
        while (y != 0){
            res = x * res;
            y--;
        }
        return res;
    }

    private static int toBinary(int n) {
        int digit = 0, multiplier = 1;
        int num = n;
        while (num != 0) {
            int rem = num % 2;
            digit += multiplier * rem;
            multiplier *= 10;
            num = num / 2;
        }
        return digit;
    }

    public static String convertToHex(int  n) {
        String digit = "";
        char[] hex = new char[]{'0','1','2','3','4','5','6','7','8','9','A', 'B', 'C', 'D', 'E', 'F'};
        while (n != 0) {
            int rem = n % 16;
            digit = hex[rem] + digit;
            n = n / 16;
        }
        return digit;
    }

    public static int nSequenceSum(int n){
        int total = 0, mult =1, sum = 0 ;
        for (int i = 0; i < 3; i++) {
            sum += n * mult;
            total += sum;
            mult *= 10;
        }
        return total;
    }

    private static int stringToInt(String str){
        return Integer.parseInt(str);
    }
    public static String secondToHMS(int seconds){
        int hour = seconds / 3600;
        int rem = seconds % 3600;
        int minutes = rem / 60;
        int sec = rem % 60;
        return (hour+"H:"+minutes+"M:"+sec+"S");
    }

    //{40, 50, 60, 70, 80} -> {60, 70, 80, 40, 50}
    public static void rotateArray(int[] a, int n){
        if (a == null || a.length <= 1) return;

        for (int i = 0; i < n; i++) {
            int temp = a[0];
            int j = 0;
            while (j+1 < a.length){
                a[j] = a[j+1];
                j++;
            }
            a[j] = temp;
        }
    }

    public static int[] multiplyTwoArr(int[] first, int[] second){
        if (first == null || second == null || first.length == 0 || second.length == 0) return new int[]{};

        int max = Math.max(first.length, second.length);
        int[] arr = new int[max];
        for (int i = 0, j=0; i < first.length && j < second.length; i++,j++) {
            arr[i] = first[i] * second[j];
        }
        return arr;
    }

    public static int[] mergeSortedArrays(int[] first, int[] second){
        if ((first == null && second == null) || (first.length == 0 && second.length == 0)) return new int[]{};

        int length = first.length + second.length;
        int[] arr = new int[length];
        int k = 0;

        for (int i = 0; i < first.length; i++) {
            arr[k++] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            arr[k++] = second[i];
        }
        insertionSort(arr);
        return arr;
    }

    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        long start = System.nanoTime();
        System.out.println("\nSorting Started: "+start);
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        long finished = System.nanoTime()-start;
        int sec1 = (int) TimeUnit.SECONDS.convert(finished, TimeUnit.NANOSECONDS);
        System.out.println("\nSorting Finished: "+sec1);
    }
}
