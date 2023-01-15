package com.learning.java.utils.csvLearn.generics;

import com.learning.java.utils.csvLearn.User;
import com.learning.java.utils.csvLearn.UserLoader;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class FindByStringWithGenerics {
    public static void main(String[] args) throws IOException {
        String filePath = "src/com/learning/java/utils/csvLearn/sample.csv";
        Vector<User> users = UserLoader.loadUsersInVector(filePath);
        System.out.printf("Loaded %d users.\n", users.size());
        System.out.println("Type a string to search for: ");
        try(Scanner userInput = new Scanner(System.in)) {
            String toFind = userInput.nextLine();
            int totalFound = 0;
            for (User user: users) {
                if (user.email.toLowerCase().contains(toFind.toLowerCase()) || user.name.toLowerCase().equals(toFind.toLowerCase())){
                    System.out.printf("Found User: %s and Email: %s\n", user.name, user.email);
                    totalFound++;
                }
            }
            if (totalFound == 0) System.out.printf("No Users with given string %s Found\n", toFind);
            else {
                System.out.printf("Found %d users with '%s'\n", totalFound, toFind);
            }
        }
    }
}
