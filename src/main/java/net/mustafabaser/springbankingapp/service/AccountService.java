package net.mustafabaser.springbankingapp.service;

import net.mustafabaser.springbankingapp.dto.AccountDto;

public interface AccountService {
    // Create Account
    AccountDto createAccount(AccountDto account);

    // Get Account
    AccountDto getAccountById(long id);

    // Update Amount: Deposit
    AccountDto deposit(long id, double amount);

    // Update Amount: Withdraw
    AccountDto withdraw(long id, double amount);
}
