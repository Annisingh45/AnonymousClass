package com.bridglabz.anonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person(23, "Anni");
        Person person2 = new Person(30, "Rahul");
        Person person3 = new Person(22, "Sneha");
        Person person4 = new Person(28, "Vikram");
        Person person5 = new Person(35, "Priya");
        Person person6 = new Person(19, "Karan");
        Person person7 = new Person(40, "Divya");
        Person person8 = new Person(26, "Aman");
        Person person9 = new Person(32, "Neha");
        Person person10 = new Person(24, "Ravi");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);

        // Print original list
        System.out.println("PersonList without sorting:");
        for (Person person : personList) {
            System.out.println(person);
        }

        // Sort based on age
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };
        personList.sort(ageComparator);

        // Print sorted by age
        System.out.println("\nPersonList after sorting based on age:");
        for (Person person : personList) {
            System.out.println(person);
        }

        // Sort based on name
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        personList.sort(nameComparator);

        // Print sorted by name
        System.out.println("\nPersonList after sorting based on name:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
