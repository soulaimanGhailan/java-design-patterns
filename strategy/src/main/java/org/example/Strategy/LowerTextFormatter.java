package org.example.Strategy;


public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("*************************");
        System.out.println("[CapTextFormatter]: "+text.toLowerCase());
        System.out.println("*************************");
    }
}
