package org.example.components;

public class Espresso extends Drink{
    public Espresso() {
        description  =  "espresso" ;
    }

    @Override
    public double cost() {
        return 10;
    }
}
