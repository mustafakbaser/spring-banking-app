package net.mustafabaser.springbankingapp.service;

import net.mustafabaser.springbankingapp.dto.AccountDto;

public interface AccountService {
    // Create Account
    AccountDto createAccount(AccountDto account);

    // Get Account
    AccountDto getAccountById(long id);
}
