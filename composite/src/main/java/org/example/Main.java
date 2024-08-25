package org.example;

import org.example.composite.Component;
import org.example.composite.File;
import org.example.composite.Folder;

public class Main {
    public static void main(String[] args) {

        Folder component1= new Folder("folder 1");
        component1.addChild(new File("file 1"));
        Component folder1 = component1.addChild(new Folder("folder 2"));
        ((Folder)folder1).addChild(new File("file 2"));

        component1.print();
    }
}