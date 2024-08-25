package org.example.composite;

public abstract class Component {
    protected String name ;

    public int level ;

    public Component(String name) {
        this.name = name;
    }

    public abstract void print()  ;
    public String getTab(){
        String tab = "" ;
        for (int i = 0; i < level; i++) {
            tab += "\t" ;
        }
        return tab ;
    }
}
