package org.example;


import org.example.Repo.AccountRepo;
import org.example.Repo.AccountRepoImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AccountRepoImpl accountRepo = AccountRepoImpl.getInstance() ;
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                accountRepo.bankPopulate();
            }).start();
        }

       System.in.read() ;
        accountRepo.getAllAccounts().forEach(System.out::println);

    }
}