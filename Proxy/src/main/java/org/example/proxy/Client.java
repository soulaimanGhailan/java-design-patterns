package org.example.proxy;

public class Client {
    private IService service ;
    public void compute(int a){
        double res = service.compute(a);
        System.out.println(a +" * " + a + " = " +res);
    }

    public void setService(IService service) {
        this.service = service;
    }
}
