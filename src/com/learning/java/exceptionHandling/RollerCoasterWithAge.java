package com.learning.java.exceptionHandling;

import java.util.Scanner;

public class RollerCoasterWithAge {
    public static class TooYoungException extends Exception {
        String name;
        int age;
        public TooYoungException(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;; i++) {
            System.out.println("Enter name of visitor: ");
            String name = scanner.nextLine();
            if (name.equals("")) break;
            try {
                System.out.println("Enter visitor's age: ");
                int age = scanner.nextInt();
                if (age < 15) {
                    throw new TooYoungException(name, age);
                }

                System.out.printf("%s is riding the roller coaster", name);
            } catch (TooYoungException e){
                System.out.printf("%s is %d years old, which is too young to ride.\n", e.name, e.age);
            }
        }
    }
}
