package com.learning.java.utils.setAndUniquenessInSET;

import java.util.HashSet;

public class HashCodeExample {
    public static void main(String[] args){

        Student student = new Student();
        student.setName("RAYMONDS");
        student.setAge(20);
        student.setYearOfPassing(2011);

        Student student1 = new Student();
        student1.setName("ALLEN");
        student1.setAge(19);
        student1.setYearOfPassing(2010);

        Student student2 = new Student();
        student2.setName("MAGGY");
        student2.setAge(18);
        student2.setYearOfPassing(2012);

        HashSet<Student> set = new HashSet<Student>();
        set.add(student);
        set.add(student1);
        set.add(student2);

        // printing all elements of set
        System.out.println("Before adding ALLEN for second time: ");
        for(Student student3: set) {
            System.out.println(student3.getName() + " "+ student3.getYearOfPassing());
        }

        // creating a student similar to student1 ALLEN
        Student student4 = new Student();
        student4.setName("ALLEN");
        student4.setAge(19);
        student4.setYearOfPassing(2010);

        // this student will be added as hashcode() and equal() are not implemented
        set.add(student4);
        System.out.println("After adding ALLEN for second time: ");
        for(Student student5: set) {
            System.out.println(student5.getName() + " "+ student5.getYearOfPassing());
        }
    }
}
