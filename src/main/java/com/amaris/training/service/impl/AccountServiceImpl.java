package com.amaris.training.service.impl;

import com.amaris.training.doman.Account;
import com.amaris.training.repository.AccountRepository;
import com.amaris.training.request.RegisterAccount;
import com.amaris.training.response.AccountResponse;
import com.amaris.training.service.AccountService;
import com.amaris.training.service.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    final AccountRepository accountRepository;

    final AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public AccountResponse createUser(RegisterAccount registerAccount) {
        Account account = accountMapper.registerAccountToAccount(registerAccount);
        Optional<Account> accountOptional = accountRepository.findByEmail(registerAccount.getEmail());
        if(accountOptional.isPresent()){
            throw new NullPointerException();
        }
        registerAccount.setCreateDate(LocalDateTime.now());
        accountRepository.save(account);
        return accountMapper.AccountToAccountResponse(account);
    }
}
