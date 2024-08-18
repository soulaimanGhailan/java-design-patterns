package org.example.Strategy;

public class CapTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("*************************");
        System.out.println("[CapTextFormatter]: "+text.toUpperCase());
        System.out.println("*************************");
    }
}
