package org.davshaw.livechat.service.entity;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.davshaw.livechat.entity.Account;
import org.davshaw.livechat.exception.http.ConflictException;
import org.davshaw.livechat.exception.http.NotFoundException;
import org.davshaw.livechat.repository.entity.AccountRepository;
import org.davshaw.livechat.security.encrypt.Encryptor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class DefaultAccountService {


  private final Encryptor encrypter = new Encryptor();
  private final AccountRepository accountRepository;

  /**
   * Get all accounts from the database.
   * @return
   */
  public List<Account> getAllAccounts() {
    return accountRepository.findAll();
  }

  /**
   * Get an account by its ID.If the account doesn't exist, throw a NotFoundException.
   * @param id
   * @return
   */
  public Optional<Account> getAccountById(String id) {
    if (!accountRepository.existsById(id)) {
      String message = String.format("Account with ID %s doesn't exist.", id);
      throw new NotFoundException(message);
    }
    return accountRepository.findById(id);
  }

  /**
   * Create a new account. If the account already exists, throw a ConflictException.
   * @param account
   * @return
   */
  public Account createAccount(Account account) {
    if (accountRepository.existsById(account.getId())) {
      String message = String.format(
        "Account with ID %s already exists.",
        account.getId()
      );
      throw new ConflictException(message);
    }

    String password = account.getPassword();
    password = encrypter.encrypt(password);
    String email = account.getEmail();
    email = encrypter.encrypt(email);
    account.setPassword(password);
    account.setEmail(email);

    return accountRepository.save(account);
  }

  /**
   * Update an account. If the account doesn't exist, throw a NotFoundException.
   * @param account
   * @return
   */
  public Account updateAccount(Account account) {
    if (!accountRepository.existsById(account.getId())) {
      String message = String.format(
        "Account with ID %s doesn't exist.",
        account.getId()
      );
      throw new NotFoundException(message);
    }

    String password = account.getPassword();
    password = encrypter.encrypt(password);
    String email = account.getEmail();
    email = encrypter.encrypt(email);
    account.setPassword(password);
    account.setEmail(email);

    return accountRepository.save(account);
  }

  /**
   * Delete an account by its ID. If the account doesn't exist, throw a NotFoundException.
   * @param id
   */
  public void deleteAccount(String id) {
    if (!accountRepository.existsById(id)) {
      String message = String.format("Account with ID %s doesn't exist.", id);
      throw new NotFoundException(message);
    }
    accountRepository.deleteById(id);
  }

  /**
   * Delete all accounts from the database.
   */
  public void deleteAllAccounts() {
    accountRepository.deleteAll();
  }

  /**
   * Check if an account exists by its ID.
   * @param id
   * @return
   */
  public boolean existsAccountById(String id) {
    return accountRepository.existsById(id);
  }
}
