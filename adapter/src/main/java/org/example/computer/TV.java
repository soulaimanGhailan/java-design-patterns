package org.example.computer;

public class TV implements HDMI{

    @Override
    public void print(byte[] data) {
        String message = new String(data);
        System.out.println("video by TV {HDMI} :" + message );
    }
}
