package org.example.Repo;

import org.example.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepo {
    BankAccount save(BankAccount account);
    Optional<BankAccount> getAccount(Long accountId);
    List<BankAccount> getAllAccounts();
    List<BankAccount> getAccounts(Predicate<BankAccount> predicate);
    BankAccount updateAccount(BankAccount account);
    void deleteAccount(Long accountId);
}
