package org.example.proxy;

public class IServiceImpl implements IService {
    @Override
    public double compute(double a) {
        return a*a;
    }
}
