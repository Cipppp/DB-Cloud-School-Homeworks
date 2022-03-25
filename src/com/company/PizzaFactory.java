package com.company;

import com.company.Enums.PizzaType;
import com.company.Enums.Topping;
import com.company.Pizza.*;

import java.util.Observer;

public class PizzaFactory {

    private static PizzaFactory uniqueInstance;
    private boolean state;
    PizzaType pizzaTypes;
    Topping toppingTypes;
    public Client client;

    PizzaFactory() {

    }
    //! Singleton class
    public static PizzaFactory instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }
        return uniqueInstance;
    }

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CAPRICIOSA:
                return new Capriciosa();
            case PROSCIUTTO_FUNGHI:
                return new ProsciuttoFunghi();
            case QUATRO_STAGIONI:
                return new QuatroStagioni();
            case MARGUERITA:
                return new Marguerita();
        }
        return null;
    }

    //! Command method
    public void orderPizza() {
        System.out.println("Pizza ordered!");
    }

    //! Getters
    public boolean getState() {
        return state;
    }

    //! Setters
    public void setState(boolean state) {
        this.state = state;
        notifyObserver();
    }

    public void attachObserver(Client client) {
        this.client = client;
    }

    public void notifyObserver() {
        client.receiveUpdate();
    }
}

//! Decorator
class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class ToppingDecorator extends PizzaDecorator {
    public ToppingDecorator(Pizza pizza) {
        super(pizza);
    }
}

//! Command pattern
class CommandOrder extends Main {
    public void execute(PizzaFactory pizzaFactory) {
        pizzaFactory.orderPizza();
    }
}