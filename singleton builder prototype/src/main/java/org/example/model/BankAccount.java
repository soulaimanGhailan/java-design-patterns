package org.example.model;

import org.example.model.enums.AccountStatus;
import org.example.model.enums.AccountType;

public class BankAccount {
    private Long bankAccountId ;
    private double balance ;
    private String currency ;
    private AccountType accountType ;
    private AccountStatus status ;

    public BankAccount(){  }
    public BankAccount(Long bankAccountId, double balance, String currency, AccountType accountType, AccountStatus status) {
        this.bankAccountId = bankAccountId;
        this.balance = balance;
        this.currency = currency;
        this.accountType = accountType;
        this.status = status;
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

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccountId=" + bankAccountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", accountType=" + accountType +
                ", status=" + status +
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

}
