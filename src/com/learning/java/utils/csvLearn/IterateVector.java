package com.learning.java.utils.csvLearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class IterateVector {
    public static Vector load(String filePath){
        Vector users = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            users = new Vector();
            CSVReader reader = new CSVReader(bufferedReader, true);
            String[] row = null;
            while ((row = reader.readRow()) != null) {
                users.add(User.fromValues(row));
            }
        } catch (Exception e) {
            System.out.println("Error occurred due to "+e);
        }
        return users;
    }
    public static void main(String[] args){
        String filePath = "src/com/learning/java/utils/csvLearn/sample.csv";
        Vector users = IterateVector.load(filePath);
        if (users.size() > 0) {
            for (Object userAsObject: users) {
                User user = (User) userAsObject;
                System.out.printf("%s - %s\n", user.name, user.email);
            }
        }
    }
}
