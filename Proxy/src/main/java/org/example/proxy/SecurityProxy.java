package org.example.proxy;

public class SecurityProxy implements IService {
    private IService service ;

    public SecurityProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(double a) {
        if(SecurityContext.role.equals("ADMIN")){
            return service.compute(a);
        }else
            throw new RuntimeException("not authorized") ;
    }
}
