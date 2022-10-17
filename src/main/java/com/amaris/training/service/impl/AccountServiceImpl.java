package com.amaris.training.service.impl;

import com.amaris.training.doman.Account;
import com.amaris.training.repository.AccountRepository;
import com.amaris.training.request.RegisterAccount;
import com.amaris.training.response.AccountResponse;
import com.amaris.training.service.AccountService;
import com.amaris.training.service.mapper.AccountMapper;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
            throw new NotFoundException("Not found");
        }
        registerAccount.setCreateDate(LocalDateTime.now());
        accountRepository.save(account);
        return accountMapper.AccountToAccountResponse(account);
    }

@Override
public AccountResponse updateUser(RegisterAccount registerAccount, Long id) {
    Account account = accountRepository.findById(id).orElseThrow(
            () -> new NotFoundException("Not found")
    );
    accountMapper.registerAccountToAccount(registerAccount);
    accountRepository.save(account);
    return accountMapper.AccountToAccountResponse(account);
}

@Override
public List<AccountResponse> getAllUser() {
    List<Account> accountList = accountRepository.findAll();
    if(accountList.isEmpty()){
        throw new NotFoundException("Not found account");
    }
    List<AccountResponse> accountResponseList = new ArrayList<>();
    accountList.forEach(a -> accountResponseList.add(accountMapper.AccountToAccountResponse(a)));
    return accountResponseList;
}

@Override
public boolean deleteUser(Long id) {
    Account account = accountRepository.findById(id).orElseThrow(
            () -> new NotFoundException("Not found account")
    );
    accountRepository.delete(account);
    return true;
}
}
