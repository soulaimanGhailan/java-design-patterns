package org.example.model;

import org.example.model.enums.AccountStatus;
import org.example.model.enums.AccountType;

public class BankAccount implements Cloneable{
    private Long bankAccountId ;
    private double balance ;
    private String currency ;
    private AccountType accountType ;
    private AccountStatus status ;
    private Customer customer ;

    public BankAccount(){  }
    public BankAccount(Long bankAccountId, double balance, String currency, AccountType accountType, AccountStatus status, Customer customer) {
        this.bankAccountId = bankAccountId;
        this.balance = balance;
        this.currency = currency;
        this.accountType = accountType;
        this.status = status;
        this.customer = customer;
    }

    public Long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccountId=" + bankAccountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", accountType=" + accountType +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }

    public static class AccountBuilder {
        private BankAccount account = new BankAccount() ;

        public AccountBuilder accountId(Long bankAccountId) {
            this.account.setBankAccountId(bankAccountId);
            return this ;
        }
        public AccountBuilder accountType(AccountType accountType) {
            this.account.setAccountType(accountType);
            return this ;
        }
        public AccountBuilder accountBalance(double accountBalance) {
            this.account.setBalance(accountBalance);
            return this ;
        }
        public AccountBuilder accountCurrency(String accountCurrency) {
            this.account.setCurrency(accountCurrency);
            return this ;
        }
        public AccountBuilder accountStatus(AccountStatus accountStatus) {
            this.account.setStatus(accountStatus);
            return this ;
        }
        public BankAccount build(){
            return this.account ;
        }
    }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount account = (BankAccount) super.clone();
        // for the customer to be cloned also inside the account object
        account.setCustomer(account.getCustomer().clone());
        return account ;
    }
}
