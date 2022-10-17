package com.learning.java.dataStructures.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StudentsArray {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Parbati");
        students.add("Laxmi");
        students.add("Sita");
        students.add("Radha");

        Iterator<String> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            String name = studentIterator.next();
            System.out.println(name);
        }

        students.clear();
        System.out.println(students);
    }
}
