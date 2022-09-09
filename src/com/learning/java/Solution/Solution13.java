package com.learning.java.Solution;

public class Solution13 {

    public static int isRailRoadTie(int[] a) {
        if ( a == null || a.length <= 1) return 0;

        boolean hasNonZero = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) hasNonZero = true; break;
        }

        if (!hasNonZero) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if ( i == 0) {
                    if (a[i+1] == 0) return 0;
                } else if ( i == a.length -1) {
                    if (a[i-1] == 0) return 0;
                } else {
                    if ((a[i+1] == 0 && a[i-1] == 0) || (a[i+1] != 0 && a[i-1] != 0)) return 0;
                }
            } else {
                if ( i == 0) return 0;
                else if ( i == a.length -1) return 0;
                else {
                    if ((a[i+1] == 0 || a[i-1] == 0)) return 0;
                }
            }
        }
        return 1;
    }
}
