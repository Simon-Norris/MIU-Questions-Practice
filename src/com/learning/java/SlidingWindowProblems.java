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
    public static int longestSubstringWithHash(String s) {
        if (s.isEmpty()){
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        HashMap<Character, Integer> seen = new HashMap<>();
        int maxLength =0, start=0;
        for (int end=0; end < s.length(); end++){
            if (seen.containsKey(s.charAt(end))) {
                start = Math.max(start, seen.get(s.charAt(end))+1);
            }
            seen.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}