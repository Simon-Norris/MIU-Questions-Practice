package com.learning.java.dataStructures.Strings;

public class Unique {
    public static String removeDuplicates(String str){
        if (str == null || str.equals("") || str.length() == 1) return str;

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                char d = result.charAt(j);
                if (c == d) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate){
                result = result + c;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str1 = "aaaaaaa";
        String str2 = "aaabbbbb";
        String str3 = "abcdefgh";
        String str4 = "Ju780iu6G768";

        String[] str = {str1, str2, str3, str4};

        for (int i = 0; i < str.length; i++) {
            String result = Unique.removeDuplicates(str[i]);
            System.out.println(result);
        }
    }
}
