package com.bridglabz.lambda;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Comparator<Student> nameComparator=(Student s1,Student s2) ->s1.name.compareTo(s2.name);

        Set<Student> students=new TreeSet<>(nameComparator);

        students.add(new Student("Anni",23,90.0));
        students.add(new Student("Khushi", 13, 80.0));
        students.add(new Student("Rahul", 22, 85.5));
        students.add(new Student("Sneha", 21, 92.3));
        students.add(new Student("Vikram", 24, 78.0));
        students.add(new Student("Priya", 20, 88.8));
        students.add(new Student("Karan", 23, 81.2));

        System.out.println("Sorting based on name:");
        for (Student student:students)
        {
            System.out.println(student);
        }

       Comparator<Student> percentageComparator=(Student s1,Student s2)->Double.compare(s1.percentage, s2.percentage);
        Set<Student> students1=new TreeSet<>(percentageComparator);

        students1.add(new Student("Anni",23,90.0));
        students1.add(new Student("Khushi", 13, 80.0));
        students1.add(new Student("Rahul", 22, 85.5));
        students1.add(new Student("Sneha", 21, 92.3));
        students1.add(new Student("Vikram", 24, 78.0));
        students1.add(new Student("Priya", 20, 88.8));
        students1.add(new Student("Karan", 23, 81.2));

        System.out.println("Sorting based on name:");
        for (Student student:students1)
        {
            System.out.println(student);
        }

    }
}
