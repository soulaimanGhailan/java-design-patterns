package org.example.proxy;

public class IServiceProxy implements IService {

    private IService service ;

    public IServiceProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(double a) {
        // before calling the method verefications
        System.out.println("before proxy");

        double res = service.compute(a) ;

        System.out.println("after proxy");
        // before getting the result verefications
        return res;
    }
}
