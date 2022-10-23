package com.learning.java.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class IncreaseOnEachRecord {
    public static User[] loadUsers(String fileToReadFrom) throws Exception {
        User[] users = new User[0];
        BufferedReader lineReader = new BufferedReader(new FileReader(fileToReadFrom));
        try(CSVReader reader = new CSVReader(lineReader)){
            String[] row  = null;
            while ((row = reader.readRecord()) != null) {
                User[] newUsers = new User[users.length + 1];
                System.arraycopy(users, 0, newUsers, 0 , users.length);
                users = newUsers;
                users[users.length - 1] = User.fromValues(row);
            }
        }
        return users;
    }
    public static Vector loadUsersAlternate(String fileToReadFrom) throws IOException {
        Vector users = new Vector();
        BufferedReader lineReader = new BufferedReader(new FileReader(fileToReadFrom));
        try(CSVReader reader = new CSVReader(lineReader)){
            String[] row  = null;
            while ((row = reader.readRecord()) != null) {
                users.add(User.fromValues(row));
            }
        }
        return users;
    }
    public static void main (String[] args) throws Exception{
        String fileName = "src/com/learning/java/utils/sample.csv";
        User[] users = loadUsers(fileName);
        System.out.println(users.length);

        Vector usersAlternate = IncreaseOnEachRecord.loadUsersAlternate(fileName);
        System.out.println(usersAlternate.size());
    }
}
