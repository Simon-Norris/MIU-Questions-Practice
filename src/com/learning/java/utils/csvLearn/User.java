package com.learning.java.utils.csvLearn;

public class User {
    public int id;
    public String name;
    public String email;

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static User fromValues(String[] values){
        int id = Integer.parseInt(values[0]);
        String name = values[1];
        String email = values[2].trim();
        return new User(id, name, email);
    }
}
