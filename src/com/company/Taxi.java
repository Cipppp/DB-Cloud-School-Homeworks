package com.company;

public class Taxi extends Vehicle
{
    private int ticketPrice;
    private int noPassengers;

    // Constructors
    public Taxi(int ticketPrice, int noPassengers) {
        this.ticketPrice = ticketPrice;
        this.noPassengers = noPassengers;
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
        System.out.println("Taxi{" +
                "ticketPrice=" + ticketPrice +
                ", noPassengers=" + noPassengers +
                '}');
    }

}
