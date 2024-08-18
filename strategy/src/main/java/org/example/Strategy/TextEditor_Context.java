package org.example.Strategy;

public class TextEditor_Context {

    private  TextFormatter textFormatter = new DefaultTextFormatter();

    public TextEditor_Context(){ }

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text){
        textFormatter.format(text);
    }


}
