package org.example;

import org.example.Strategy.CapTextFormatter;
import org.example.Strategy.LowerTextFormatter;
import org.example.Strategy.TextEditor_Context;
import org.example.Strategy.TextFormatter;

public class Main {
    public static void main(String[] args) {
        /** Strategy design patterns **/
        TextEditor_Context editor = new TextEditor_Context();
        editor.publishText("Testing text in Default formatter");
        TextFormatter formatter = new CapTextFormatter();
        editor.setTextFormatter(formatter);
        formatter = new LowerTextFormatter();
        editor.publishText("Testing text in caps formatter");
        editor.setTextFormatter(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}