package net.mustafabaser.springbankingapp.service;

import net.mustafabaser.springbankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {
    // Create Account
    AccountDto createAccount(AccountDto account);

    // Get Account
    AccountDto getAccountById(long id);

    // Get All Accounts
    List<AccountDto> getAllAccounts();

    // Update Amount: Deposit
    AccountDto deposit(long id, double amount);

    // Update Amount: Withdraw
    AccountDto withdraw(long id, double amount);

    // Delete Account By Id
    void deleteAccount(long id);
}
