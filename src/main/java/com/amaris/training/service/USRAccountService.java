package com.amaris.training.service;

import com.amaris.training.dto.response.AccountResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface USRAccountService {
//    AccountResponse createUser(RegisterAccount registerAccount);
//
//    AccountResponse updateUser(RegisterAccount registerAccount,Long id);

    List<AccountResponse> getAllUser();
    List<AccountResponse> getUserById(String id);
}
