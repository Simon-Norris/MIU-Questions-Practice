package com.learning.java;

import java.util.*;
class SlidingWindowProblems {
    public static int longestSubstring(String s) {
        String test = "";
        if (s.isEmpty()){
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        int maxLength =0;
        for (char ch : s.toCharArray()) {
            String current = String.valueOf(ch);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)+1);
            }
            test += current;
            maxLength = Math.max(test.length(), maxLength);
        }
        return maxLength;
    }
}