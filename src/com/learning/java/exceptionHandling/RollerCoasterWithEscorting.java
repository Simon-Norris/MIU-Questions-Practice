package com.learning.java.exceptionHandling;

import java.util.Scanner;

public class RollerCoasterWithEscorting {

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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter user name: ");
            String name = scanner.nextLine();
            if (name.equals("")) break;
            try {
                System.out.println("Enter user age: ");
                int age = scanner.nextInt();
                if (age < 15) throw new TooYoungException(name, age);
                System.out.println("Enter user height: ");
                int height = scanner.nextInt();
                if (height < 130) throw new TooShortException(name, height);
                System.out.println(name+" is riding the roller coaster.");
            } catch (TooYoungException youngException){
                System.out.printf("%s is %s years old which is too young to ride. ", youngException.name, youngException.age);
            } catch (TooShortException shortException){
                System.out.printf("%s is %scm which is too short to ride. ", shortException.name, shortException.height);
            } finally {
                System.out.println("Escorting "+name+" out of premises.");
            }
        }
    }
}
