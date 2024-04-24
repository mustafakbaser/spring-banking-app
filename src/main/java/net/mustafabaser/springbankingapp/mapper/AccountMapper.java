package net.mustafabaser.springbankingapp.mapper;

import net.mustafabaser.springbankingapp.dto.AccountDto;
import net.mustafabaser.springbankingapp.entity.Account;

public class AccountMapper {
    public static Account mapAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountOwnerName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountOwnerName(),
                account.getBalance()
        );
        return accountDto;
    }
}
