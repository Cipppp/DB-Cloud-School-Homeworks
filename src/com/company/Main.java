package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Input data
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle first_vehicle = new Taxi(1000, 10);
        Vehicle second_vehicle = new Bus(60, 10);
        Vehicle third_vehicle = new Taxi(100, 50);
        vehicles.add(first_vehicle);
        vehicles.add(second_vehicle);
        vehicles.add(third_vehicle);

        BusStation bus = new BusStation(vehicles);

        System.out.println("Vehicles before sorting: ");
        bus.showAllVehicles();
        bus.showTotalProfit();

        System.out.println();
        System.out.println("Vehicles after sorting: ");
        bus.sortVehicles();
        bus.showAllVehicles();

    }
}
