package com.learning.java;

import com.learning.java.Solution.*;
public class Main
{

    public static void main(String[] args) {
        int num1= 10;
        int num2 = 11;
        System.out.println("The sum of two binary numbers is: "+Miscellaneous.addBinary(num1, num2));

        int hex = 1256;
        System.out.println("The converted hex num is: "+Miscellaneous.convertToHex(hex));

        int num = 5;
        System.out.println("The n sequence sum n+nn+nnn is: "+Miscellaneous.nSequenceSum(num));

        int seconds = 7320;
        System.out.println("The converted second int HMS is "+Miscellaneous.secondToHMS(seconds));
    }
}

