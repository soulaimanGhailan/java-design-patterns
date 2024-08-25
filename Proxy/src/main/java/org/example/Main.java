package org.example;

import org.example.proxy.*;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("soulaiman" , "password" , "ADMIN");
        Client client = new Client();
        client.setService(new SecurityProxy(new CashProxy(new IServiceImpl())));


        client.compute(2);
        client.compute(3);
        client.compute(2);
    }
}