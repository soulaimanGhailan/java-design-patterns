package org.example;

import org.example.model.BankAccount;
import org.example.model.Customer;
import org.example.model.enums.AccountStatus;
import org.example.model.enums.AccountType;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount account = new BankAccount() ;
        account.setBankAccountId(1L);
        account.setAccountType(AccountType.CURRENT_ACCOUNT);
        account.setBalance(1000);
        account.setCurrency("MAD");
        account.setStatus(AccountStatus.CREATED);
        account.setCustomer(new Customer(1L , "mohammed"));

        BankAccount clonedAccount = account.clone() ;


        System.out.println(clonedAccount);
    }
}
