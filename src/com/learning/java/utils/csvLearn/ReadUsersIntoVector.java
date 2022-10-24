package com.learning.java.utils.csvLearn;

import java.io.IOException;
import java.util.Vector;

public class ReadUsersIntoVector {
    public static void main(String[] args) throws IOException {
        String filePath = "src/com/learning/java/utils/sample.csv";
        Vector users = UserLoader.loadUsersInVector(filePath);
        System.out.println(users.lastElement());
    }
}
