package com.bridglabz.anonymous;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class VehicleMain {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new TreeSet<>(
                new Comparator<Vehicle>() {
                    @Override
                    public int compare(Vehicle o1, Vehicle o2) {
                        return o1.name.compareTo(o2.name);
                    }
                }
        );
        vehicles.add(new Vehicle("Yamala", "Red"));
        vehicles.add(new Vehicle("Tata Punch", "Blue"));
        vehicles.add(new Vehicle("Mercedes", "Black"));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}
//Anonymous inner class define as an argument
