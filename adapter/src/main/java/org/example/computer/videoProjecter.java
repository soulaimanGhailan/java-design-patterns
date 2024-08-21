package org.example.computer;

public class videoProjecter  implements VGA  {

    @Override
    public void print(String message) {
        System.out.println("message by video projecter {VGA}: " +message);
    }
}
