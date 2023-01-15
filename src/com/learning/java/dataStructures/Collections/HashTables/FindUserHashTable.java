package com.learning.java.dataStructures.Collections.HashTables;

import com.learning.java.utils.csvLearn.User;
import com.learning.java.utils.csvLearn.UserLoader;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class FindUserHashTable {
    public static void main(String[] args) throws IOException {
        String filePath = "src/com/learning/java/utils/csvLearn/sample.csv";
        Hashtable users = UserLoader.loadUsersInHashtableByEmail(filePath);
        System.out.printf("Loaded %d unique users.\n", users.size());
        System.out.print("Type a user email: ");
        Scanner userInput = new Scanner(System.in);
        String email = userInput.nextLine();
        if (!users.containsKey(email)) {
            System.out.printf("Sorry, user with the email %s not found.\n", email);
            return;
        }
        User user = (User) users.get(email);
        System.out.printf("User with email '%s' found!\n", email);
        System.out.printf("ID: %d , Name: %s",user.id , user.name);
    }
}
