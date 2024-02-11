package org.davshaw.livechat.service;

import java.util.List;
import java.util.Optional;

import org.davshaw.livechat.repository.AccountRepository;

import org.springframework.stereotype.Service;

import org.davshaw.livechat.entity.Account;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class DefaultAccountService {
    
    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(String id) {
        if (!accountRepository.existsById(id)) {
            String message = String.format(
                "Account with ID %s doesn't exist.", id);
                
            throw new IllegalArgumentException(message);
        }
        return accountRepository.findById(id);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    public void deleteAllAccounts() {
        accountRepository.deleteAll();
    }

    public boolean existsAccountById(String id) {
        return accountRepository.existsById(id);
    }
    
}
