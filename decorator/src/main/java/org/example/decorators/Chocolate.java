package org.example.decorators;

import org.example.components.Drink;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.5;
    }
}
