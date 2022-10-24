package com.learning.java.utils.csvLearn;

import com.learning.java.utils.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class UserLoader {
    public static Vector loadUsersInVector(String pathToFile) throws IOException {
        Vector users = new Vector();
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try(CSVReader reader = new CSVReader(lineReader)) {
            String[] row = null;
            while ((row = reader.readRow()) != null){
                users.add(User.fromValues(row));
            }
        }
        return users;
    }
}
