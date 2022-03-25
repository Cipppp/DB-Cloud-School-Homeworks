package com.company;

public abstract class Main {

    public abstract void execute(PizzaFactory pizzaFactory);

    public static void main(String[] args) {

        //! Observer testing
        PizzaFactory pizzaFactory = new PizzaFactory();
        Client client = new Client(pizzaFactory);
        pizzaFactory.setState(true);
        pizzaFactory.setState(true);

        //! Order a new pizza
        CommandOrder c1 = new CommandOrder();
        c1.execute(pizzaFactory);
    }
}
