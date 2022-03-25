package com.company;

public class Client {

    private static PizzaFactory pizzaFactory;

    public Client(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        this.pizzaFactory.attachObserver(this);
    }

    public void receiveUpdate() {
        if (pizzaFactory.getState()) {
            System.out.println("Pizza is ready!");
        } else {
            System.out.println("Pizza is not ready!");
        }
    }

}
