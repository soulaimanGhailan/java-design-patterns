package org.example;

import org.example.components.Drink;
import org.example.components.Espresso;
import org.example.decorators.Caramel;
import org.example.decorators.Chocolate;

public class Main {
    public static void main(String[] args) {
        Drink drink  = new Espresso() ;
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());

        System.out.println();

        drink = new Chocolate(drink) ;
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());

        System.out.println();

        drink = new Caramel(drink) ;
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());
    }
}