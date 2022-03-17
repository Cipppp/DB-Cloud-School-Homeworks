package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BusStation {
    private List<Vehicle> vehicleList;

    public BusStation(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void showAllVehicles() {
        for (int index = 0; index < vehicleList.size(); index++) {
            vehicleList.get(index).display();
        }
    }

    public void showTotalProfit() {
        int sum = 0;

        for (int index = 0; index < vehicleList.size(); index++) {
            sum += vehicleList.get(index).profit();
        }

        System.out.println("Total profit = " + sum);
    }

    // Sort vehicles by their profit
    public void sortVehicles() {
        Collections.sort(vehicleList);
    }

}
