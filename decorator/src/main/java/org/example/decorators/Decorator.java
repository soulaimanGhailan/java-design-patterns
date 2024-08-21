package org.example.decorators;

import org.example.components.Drink;

public abstract class Decorator extends Drink{
    protected Drink drink ;

    public Decorator(Drink drink) {
        this.drink = drink;
    }
}
