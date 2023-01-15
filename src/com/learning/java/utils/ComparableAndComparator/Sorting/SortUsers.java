package com.learning.java.utils.ComparableAndComparator.Sorting;

import com.learning.java.utils.csvLearn.CSVReader;
import com.learning.java.utils.csvLearn.User;
import com.learning.java.utils.csvLearn.UserLoader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortUsers {
    public static Hashtable<String, User> loadUsersFromCSV(String filePath) throws IOException{
        Hashtable<String, User> users = new Hashtable<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        CSVReader csvReader = new CSVReader(bufferedReader, true);
        String[] record = null;
        while ((record = csvReader.readRow()) != null) {
            User user = User.fromValues(record);
            users.getOrDefault(user.email, user);
            users.put(user.email, user);
        }
        return users;
    }
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/learning/java/utils/csvLearn/sample.csv";
        Hashtable<String, User> loadedUsers = loadUsersFromCSV(fileName);
        Vector<User> users = new Vector<>(loadedUsers.values());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the field name with which you can sort the users");
        String fieldChosen = scanner.nextLine();
        Comparator<User> comparator = null;
        switch (fieldChosen) {
            case "id":
                comparator = new CompareUsersByID();
                break;
            case "name":
                comparator = new CompareUsersByName();
                break;
            case "email":
                comparator = new CompareUsersByEmail();
                break;
            default:
                System.out.println("Sorry the field doesn't exist!!");
                break;
        }
        System.out.println("Sorting by "+fieldChosen);
        Collections.sort(users, comparator);
        for (User user: users) {
            System.out.printf("%d - %s, %s\n", user.id,user.name,user.email);
        }
    }
}
