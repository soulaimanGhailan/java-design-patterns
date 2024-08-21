package org.example.decorators;

import org.example.components.Drink;

public class Caramel extends Decorator {
    public Caramel(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return drink.cost() + 1.5;
    }
}
