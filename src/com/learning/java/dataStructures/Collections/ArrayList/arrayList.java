package com.learning.java.dataStructures.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * As Opposed to Array, ArrayList is a dynamic list that can be grown and shrink as per our need.
 * They are created with an initial size which will be enlarged or shrank once we add or remove an item.
 * ArrayList only supports storage of reference types (i.e Objects) and don't support primitive types.
 * But as Java have wrapper classes for primitive types, we can use them to store the primitives in an ArrayList.
 */
public class arrayList {
    public static void main(String[] args){
        List<String> students = new ArrayList<>();

        // add the name of the four students
        students.add("Kamal");
        students.add("Hari");
        students.add("Krishna");
        students.add("Bhola");

        System.out.println(students);

        // remove last student
        students.remove("Bhola");

        System.out.println(students);

        // find the students at index 0
        System.out.println(students.get(0));


        // Replace the first student at index 0
        students.set(0, "Nakkal");

        System.out.println(students);
    }
}
