package com.learning.java.utils.ComparableAndComparator.Sorting;

import com.learning.java.utils.csvLearn.User;

import java.util.Comparator;

public class CompareUsersByEmail implements Comparator<User> {

    public int compare(User user1, User user2) {
        return user1.email.toLowerCase().compareTo(user2.email.toLowerCase());
    }
}
