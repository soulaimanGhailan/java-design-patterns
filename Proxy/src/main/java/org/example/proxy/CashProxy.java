package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class CashProxy implements IService {
    private Map<Double , Double> cache = new HashMap<Double , Double>();

    private IService service ;

    public CashProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(double a) {
        if(cache.containsKey(a)){
            System.out.println();
            System.out.println("result generated form cash");
            return cache.get(a);
        }else{
            double res = service.compute(a);
            cache.put(a, res);
            System.out.println();
            System.out.println("new result");
            return res ;
        }
    }
}
