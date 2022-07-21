package com.learning.java;

import java.util.*;
public class Main
{

    public static void main(String[] args) {

        // find hte longest substring without repeating characters
        String[] toCheck = {"abcabacbb","bbbbb","pwwkew"};
        System.out.println(SlidingWindowProblems.longestSubstring(toCheck[0]));
        System.out.println(SlidingWindowProblems.longestSubstringWithHash(toCheck[2]));

        // Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

        String s1 ="ab" , s2 = "eidbaooo";
        System.out.println(PermuationInString.checkInclusionOne(s1, s2));
    }
}

