package com.amaris.training.service;

import com.amaris.training.request.RegisterAccount;
import com.amaris.training.response.AccountResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService{
    AccountResponse createUser(RegisterAccount registerAccount);

    AccountResponse updateUser(RegisterAccount registerAccount,Long id);

    List<AccountResponse> getAllUser();
    boolean deleteUser(Long id);
}
