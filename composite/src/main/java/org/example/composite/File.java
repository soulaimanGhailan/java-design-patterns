package org.example.composite;

public class File extends Component{
    public File(String name) {
        super(name);
    }

    @Override
    public void print() {

        System.out.println(this.getTab()+"file name : " + name );
    }
}
