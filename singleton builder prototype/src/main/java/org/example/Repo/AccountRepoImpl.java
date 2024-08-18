package org.example.Repo;

import org.example.model.BankAccount;
import org.example.model.Director;
import org.example.model.enums.AccountStatus;
import org.example.model.enums.AccountType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepoImpl implements AccountRepo {
    private Map<Long, BankAccount> accounts = new HashMap<>();
    private long accountNum  =  0 ;

    private static final AccountRepoImpl accountRepo ;

    // a static block will be executed when the class is loaded to the memory
    static {
        System.out.println("singleton init");
        accountRepo = new AccountRepoImpl();
    }

    // to prevent ferther instantiation of the object
    private AccountRepoImpl() {}

    @Override
    public BankAccount save(BankAccount account) {
        synchronized (this) {
            ++accountNum;
            account.setBankAccountId(accountNum);
            accounts.put(account.getBankAccountId() , account);
        }
        return account;
    }

    @Override
    public Optional<BankAccount> getAccount(Long accountId) {
        BankAccount bankAccount = accounts.get(accountId);
        return bankAccount == null ? Optional.empty() : Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> getAllAccounts() {
        return accounts.values().stream().toList();
    }

    @Override
    public List<BankAccount> getAccounts(Predicate<BankAccount> predicate) {
        return accounts.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount updateAccount(BankAccount account) {
        accounts.put(account.getBankAccountId() , account) ;
        return account;
    }

    @Override
    public void deleteAccount(Long accountId) {
        accounts.remove(accountId) ;
    }

    public void bankPopulate(){
        for (int i = 0; i < 10; i++) {
            BankAccount account = Director.accountBuilder()
                    .accountBalance(1000)
                    .accountType(AccountType.CURRENT_ACCOUNT)
                    .accountStatus(AccountStatus.ACTIVATED)
                    .accountCurrency("MAD")
                    .build();
            save(account) ;
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("account num " + accountNum);
        System.out.println("accounts size " +accounts.values().size());
    }

    public static AccountRepoImpl getInstance(){
        return accountRepo;
    }
}
