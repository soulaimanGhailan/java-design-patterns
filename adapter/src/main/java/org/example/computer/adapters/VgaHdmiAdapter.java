package org.example.computer.adapters;

import org.example.computer.HDMI;
import org.example.computer.VGA;

public class VgaHdmiAdapter implements VGA {
    private HDMI hdmi ;
    @Override
    public void print(String message) {
        byte[] data = message.getBytes();
        System.out.println("par adapter vga ----------------------> hdmi");
        hdmi.print(data);
        System.out.println("par adapter vga ----------------------> hdmi");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
