package com.learning.java;

import java.util.*;
public class Main
{

    public static void main(String[] args) {

        // find hte longest substring without repeating characters
        String[] toCheck = {"abcabacbb","bbbbb","pwwkew"};
        System.out.println(SlidingWindowProblems.longestSubstring(toCheck[0]));
        System.out.println(SlidingWindowProblems.longestSubstringWithHash(toCheck[2]));
    }
}

