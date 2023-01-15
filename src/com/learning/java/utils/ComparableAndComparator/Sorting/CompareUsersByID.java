package com.learning.java.utils.ComparableAndComparator.Sorting;

import com.learning.java.utils.csvLearn.User;

import java.util.Comparator;

public class CompareUsersByID implements Comparator<User> {

    public int compare(User user1, User user2) {
        if (user1.id < user2.id) return -1;
        else if (user1.id == user2.id) return 0;
        else return 1;
    }
}

