package com.amaris.training.web.rest;

import com.amaris.training.request.RegisterAccount;
import com.amaris.training.response.AccountResponse;
import com.amaris.training.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    AccountResponse createAccount(@RequestBody RegisterAccount registerAccount){
        return  accountService.createUser(registerAccount);
    }
}
