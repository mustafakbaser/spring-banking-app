package net.mustafabaser.springbankingapp.service.impl;

import net.mustafabaser.springbankingapp.dto.AccountDto;
import net.mustafabaser.springbankingapp.entity.Account;
import net.mustafabaser.springbankingapp.mapper.AccountMapper;
import net.mustafabaser.springbankingapp.repository.AccountRepository;
import net.mustafabaser.springbankingapp.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
                () -> new RuntimeException("The account could not be located.")
        );
        return AccountMapper.mapAccountDto(account);
    }

    // Get All Accounts
    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map(
                (account) -> AccountMapper.mapAccountDto(account))
                .collect(Collectors.toList());
    }

    // Deposit Amount
    @Override
    public AccountDto deposit(long id, double amount) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("The account could not be located.")
                );
        double totalAmount = account.getBalance() + amount;
        account.setBalance(totalAmount);
        Account updatedAccount = accountRepository.save(account);
        return AccountMapper.mapAccountDto(updatedAccount);
    }

    // Withdraw Amount
    @Override
    public AccountDto withdraw(long id, double amount) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("The account could not be located.")
                );

        // Exception
        if(account.getBalance() - amount < 0) {
            throw new RuntimeException("Insufficient balance");
        }
        double totalAmount = account.getBalance() - amount;
        account.setBalance(totalAmount);
        Account updatedAccount = accountRepository.save(account);
        return AccountMapper.mapAccountDto(updatedAccount);
    }

    // Deleting Account By Id
    @Override
    public void deleteAccount(long id) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("The account could not be located.")
                );
        accountRepository.deleteById(id);
    }
}
