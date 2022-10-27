package com.learning.java.utils.csvLearn;

import java.util.Vector;

public class IncreaseOnEachRecord {
    public static void main(String[] args) throws Exception {
        String filePath = "src/com/learning/java/utils/csvLearn/sample.csv";
        Vector users = UserLoader.loadUsersInVector(filePath);
        for (int i = 0; i < users.size(); i++) {
            User user = (User) users.get(i);
            System.out.println("Id: "+user.id+" Name: "+user.name+" Email: "+user.email);
        }
    }
}
