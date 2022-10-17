package com.amaris.training.service;

import com.amaris.training.request.RegisterAccount;
import com.amaris.training.response.AccountResponse;
import org.springframework.stereotype.Service;

@Service
public interface AccountService{
    AccountResponse createUser(RegisterAccount registerAccount);
}
