package org.example;


import org.example.Repo.AccountRepo;
import org.example.Repo.AccountRepoImpl;

public class Main {
    public static void main(String[] args) {
        AccountRepoImpl accountRepo = new AccountRepoImpl() ;
        accountRepo.bankPopulate();
        accountRepo.getAllAccounts().forEach(System.out::println);

    }
}