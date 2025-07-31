package com.bridglabz.anonymous;

public class Vehicle {
    String name;
    String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
