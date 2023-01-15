package com.learning.java.exceptionHandling;

import java.util.Scanner;

public class RollerCoasterWithAgeAndHeight {

    public static class TooYoungException extends Exception{
        String name;
        int age;

        TooYoungException(String name, int age){
            this.name = name;
            this.age = age;
        }

    }

    public static class TooShortException extends Exception{
        String name;
        int height;

        TooShortException(String name, int height){
            this.name = name;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; ; i++) {
            System.out.println("Enter user's name: ");
            String userName = scanner.nextLine();
            if (userName.equals("")) break;
            try {
                System.out.println("Enter user's age: ");
                int age = scanner.nextInt();
                if (age < 15) {
                    throw new TooYoungException(userName, age);
                }
                System.out.println("Enter user's height: ");
                int height = scanner.nextInt();
                if (height < 130) {
                    throw new TooShortException(userName, height);
                }
                System.out.println(userName+ " is riding the roller coaster");
            } catch (TooYoungException youngException){
                System.out.printf("%s is %s years which is too young to ride roller coaster", youngException.name, youngException.age);
            } catch (TooShortException shortException){
                System.out.printf("%s is %scm which is too short to ride roller coaster", shortException.name, shortException.height);
            }
        }
    }
}
