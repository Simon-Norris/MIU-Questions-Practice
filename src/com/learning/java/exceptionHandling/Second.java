package com.learning.java.exceptionHandling;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i=0; i<3; i++){
            System.out.println("Enter a whole number: ");
            boolean isValid = false;
            while (!isValid) {
                try {
                    int input = Integer.parseInt(scanner.nextLine());
                    total += input;
                    isValid = true;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("please provide a valid whole number");
                }
            }
        }
        System.out.println("The sum of three whole number is: "+total);
    }
}
