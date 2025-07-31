package com.bridglabz.lambda;

public class Student {
    String name;
    int rollNumber;
    double percentage;

    public Student(String name, int rollNumber, double percentage) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", percentage=" + percentage +
                '}';
    }
}
