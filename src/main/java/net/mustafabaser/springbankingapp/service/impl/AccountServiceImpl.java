package net.mustafabaser.springbankingapp.service.impl;

import net.mustafabaser.springbankingapp.dto.AccountDto;
import net.mustafabaser.springbankingapp.entity.Account;
import net.mustafabaser.springbankingapp.mapper.AccountMapper;
import net.mustafabaser.springbankingapp.repository.AccountRepository;
import net.mustafabaser.springbankingapp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapAccountDto(savedAccount);
    }

    // Get Account By Id
    @Override
    public AccountDto getAccountById(long id) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(
                () -> new RuntimeException("Account couldn't be found.")
        );
        return AccountMapper.mapAccountDto(account);
    }
}
