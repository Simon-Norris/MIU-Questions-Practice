package com.learning.java.Solution;

public class Solution7 {

    public static int isCentered(int[] a){
        if (a == null || a.length % 2 == 0) return 0;

        int centered = a[a.length/2];
        for (int i = 0; i < a.length; i++) {
            if (i == a.length/2) continue;
            if (a[i] <= centered) return 0;
        }
        return 1;
    }

    public static int isDual(int[] a){
        if (a == null) return 0;
        if (a.length == 0) return 1;
        if (a.length % 2 != 0) return 0;
        int sum = a[0]+a[1];
        for (int i = 0; i < a.length-1; i=i+2) {
            if ( a[i] + a[i+1] != sum) return 0;
        }
        return 1;
    }

    public static int isAllPossibilities(int[] a) {
        if (a == null || a.length == 0) return 0;

        int start = 0;
        int end = a.length - 1;

        for (int i = start; i < end; i++) {
            boolean found  = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]){
                    found = true;
                    break;
                }
            }
            if(!found) return 0;
        }

        return 1;
    }

}
