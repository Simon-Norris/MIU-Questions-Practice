package com.learning.java.utils.ComparableAndComparator;

/** Note: Remember that Capital Alphabets come before Lowecase Alphabets since Comparator compares using
            ascii values or we can say lexicographically **/
public class UseAlphabeticComparator {
    public static void main(String[] args){
        AlphabeticComparator comparator = new AlphabeticComparator();
        System.out.println(comparator.compare("A", "B") < 0);
        System.out.println(comparator.compare("B", "A") > 0);
        System.out.println(comparator.compare("B", "a") < 0);
        System.out.println(comparator.compare("b", "A") > 0);
        System.out.println(comparator.compare("a", "b") < 0);
        System.out.println(comparator.compare("b", "a") > 0);
    }
}
