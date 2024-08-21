package org.example;

import org.example.computer.DesktopComputer;
import org.example.computer.Monitor;
import org.example.computer.TV;
import org.example.computer.adapters.VgaHdmiAdapter;

public class Main {
    public static void main(String[] args) {
        DesktopComputer computer = new DesktopComputer();
        computer.setVga(new Monitor());
        computer.print("Hello World");

        System.out.println();

        VgaHdmiAdapter adapter = new VgaHdmiAdapter();
        adapter.setHdmi(new TV());
        computer.setVga(adapter);

        computer.print("Hello World");
    }
}