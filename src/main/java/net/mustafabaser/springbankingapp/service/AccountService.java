package net.mustafabaser.springbankingapp.service;

import net.mustafabaser.springbankingapp.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
}
