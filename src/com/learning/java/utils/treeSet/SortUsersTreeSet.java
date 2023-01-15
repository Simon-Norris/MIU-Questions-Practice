package com.learning.java.utils.treeSet;

import com.learning.java.utils.ComparableAndComparator.Sorting.CompareUsersByEmail;
import com.learning.java.utils.ComparableAndComparator.Sorting.CompareUsersByID;
import com.learning.java.utils.ComparableAndComparator.Sorting.CompareUsersByName;
import com.learning.java.utils.csvLearn.User;
import com.learning.java.utils.csvLearn.UserLoader;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortUsersTreeSet {
    public static void main(String[] args) throws IOException{
        String filePath = "src/com/learning/java/utils/csvLearn/sample.csv";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a field to sort by: ");
        String input = scanner.nextLine();
        Comparator<User> comparator = null;
        switch (input) {
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
                System.out.printf("Sorry, invalid option: %s\n", input);
        }
        System.out.printf("Sorting by %s\n", input);
        TreeSet<User> users = new TreeSet<>(comparator);
        UserLoader.loadUsersIntoSet(filePath, users);
        for(User user: users) {
            System.out.printf("%d - %s, %s\n", user.id, user.name, user.email);
        }
    }
}
