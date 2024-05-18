package com.amaris.training.service;

import com.amaris.training.dto.request.AccountRequest;
import com.amaris.training.dto.response.AccountResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ADMAccountService {
    AccountResponse createUser(AccountRequest accountRequest);
//
//    AccountResponse updateUser(RegisterAccount registerAccount,Long id);

    List<AccountResponse> getAllUser();
    AccountResponse getUserByID (String user_id);

//    boolean deleteUser(Long id);
}
