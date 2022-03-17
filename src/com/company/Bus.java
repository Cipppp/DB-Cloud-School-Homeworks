package com.company;

public class Bus extends Vehicle{

    private int ticketPrice;
    private int noPassengers;

    // Constructors
    public Bus(int noPassengers, int ticketPrice) {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    // Overridden methods
    @Override
    public int charge() {
        return ticketPrice;
    }

    @Override
    public int profit() {
        return ((int) (charge() * 0.25)) * noPassengers; // Casting to int
    }

    @Override
    public void display() {
        System.out.println("Bus{" +
                "ticketPrice= " + ticketPrice +
                ", noPassengers= " + noPassengers +
                '}');
    }
}
