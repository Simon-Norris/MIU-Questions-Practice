package com.learning.java.utils.ComparableAndComparator.Sorting;

import com.learning.java.utils.csvLearn.User;

import java.util.Comparator;

class CompareUsersByID implements Comparator<User> {

    public int compare(User user1, User user2) {
        if (user1.id < user2.id) return -1;
        else if (user1.id == user2.id) return 0;
        else return 1;
    }
}

class CompareUsersByName implements Comparator<User> {

    public int compare(User user1, User user2) {
        return user1.name.toLowerCase().compareTo(user2.name.toLowerCase());
    }
}

class CompareUsersByEmail implements Comparator<User> {

    public int compare(User user1, User user2) {
        return user1.email.toLowerCase().compareTo(user2.email.toLowerCase());
    }
}
