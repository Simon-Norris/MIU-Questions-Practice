package com.learning.java.dataStructures.Strings;

import java.util.Scanner;
public class NameTell {
    public static void main(String[] args){
        System.out.print("Enter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Your name has %s letters including spaces\n", name.length());
        System.out.println("THe first letter is: "+name.charAt(0));
    }
}
