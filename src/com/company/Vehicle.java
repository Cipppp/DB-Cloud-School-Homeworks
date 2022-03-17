package com.company;

// Made this class abstract so that I can define abstract methods
public abstract class Vehicle implements Comparable<Vehicle>{

    public String colour;
    public Boolean functional;

    public abstract int charge();
    public abstract int profit();
    public abstract void display();

    // Constructors
    public Vehicle() {

    }

    public Vehicle(String colour, Boolean functional) {
        this.colour = colour;
        this.functional = functional;
    }

    // Getters
    public String getColour() {
        return colour;
    }

    public Boolean getFunctional() {
        return functional;
    }

    // Setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFunctional(Boolean functional) {
        this.functional = functional;
    }

    // Overridden methods
    @Override
    public int compareTo(Vehicle vehicle) {
        return this.profit() - vehicle.profit();
    }

}
