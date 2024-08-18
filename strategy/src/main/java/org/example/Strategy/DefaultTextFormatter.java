package org.example.Strategy;

public class DefaultTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("*************************");
        System.out.println("[DefaultTextFormatter]: "+text);
        System.out.println("*************************");
    }
}
