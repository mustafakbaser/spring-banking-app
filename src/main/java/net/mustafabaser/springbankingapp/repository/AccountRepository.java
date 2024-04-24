package net.mustafabaser.springbankingapp.repository;

import net.mustafabaser.springbankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
