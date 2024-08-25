package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    private List<Component> components = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {

        System.out.println(this.getTab() +"folder name :" + name);
        for (Component component : components) {
            component.print();
        }
    }

    public Component addChild(Component child) {
        child.level = this.level + 1;
        components.add(child);
        return child ;
    }
}
