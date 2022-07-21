package com.learning.java;
/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

  In other words, return true if one of s1's permutations is the substring of s2.
*/
public class PermuationInString {
    static boolean flag = false;
    public static boolean checkInclusion(String s1, String s2) {
        PermuationInString.permute(s1, s2, 0);
        return flag;
    }
    public static String swap(String s, int i0, int i1) {
        if (i0 == i1)
            return s;
        String s1 = s.substring(0, i0);
        String s2 = s.substring(i0 + 1, i1);
        String s3 = s.substring(i1 + 1);
        return s1 + s.charAt(i1) + s2 + s.charAt(i0) + s3;
    }

    static void permute(String s1, String s2, int l) {
        if (l == s1.length()) {
            if (s2.contains(s1))
                flag = true;
        } else {
            for (int i = l; i < s1.length(); i++) {
                s1 = swap(s1, l, i);
                permute(s1, s2, l + 1);
                s1 = swap(s1, l, i);
            }
        }
    }
}
