package com.amaris.training.web.rest;

import com.amaris.training.dto.request.RegisterAccount;
import com.amaris.training.dto.response.AccountResponse;
import com.amaris.training.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    ResponseEntity<String> createAccount(@RequestBody @Valid RegisterAccount registerAccount){
        accountService.createUser(registerAccount);
        return new ResponseEntity<>("Create Account successfully",null, HttpStatus.OK);
    }
    @PutMapping("/{id}")
        AccountResponse updateAccount(@RequestBody RegisterAccount registerAccount,@PathVariable Long id){
            return accountService.updateUser(registerAccount,id);
    }

    @GetMapping
        List<AccountResponse> getAllAccount(){
    return  accountService.getAllUser();
}

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteAccount(@PathVariable Long id){
        if (accountService.deleteUser(id)){
            return new ResponseEntity<>("Delete successfully",null, HttpStatus.OK);
        }
        return new ResponseEntity<>("Delete not successfully",null, HttpStatus.BAD_REQUEST);
    }
}
