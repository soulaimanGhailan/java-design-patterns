package org.example.computer;

public class Monitor implements VGA{
    @Override
    public void print(String message) {
        System.out.println("video by monitor {VGA} :" + message);
    }
}
