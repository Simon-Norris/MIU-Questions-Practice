package com.learning.java.utils.csvLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class UserLoader {
    public static Vector loadUsersInVector(String pathToFile) throws IOException {
        Vector users = new Vector();
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try(CSVReader reader = new CSVReader(lineReader, true)) {
            String[] row = null;
            while ((row = reader.readRow()) != null){
                users.add(User.fromValues(row));
            }
        }
        return users;
    }

    public static Hashtable loadUsersInHashtableByEmail(String filePath) throws IOException {
        Hashtable users = new Hashtable();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        CSVReader csvReader = new CSVReader(bufferedReader, true);
        String[] row = null;
        while ((row = csvReader.readRow()) != null) {
            User user  = User.fromValues(row);
            users.put(user.email, user);
        }
        return users;
    }
}
