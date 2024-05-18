package com.amaris.training.web.rest;

import com.amaris.training.dto.request.AccountRequest;
import com.amaris.training.dto.response.AccountResponse;
import com.amaris.training.service.ADMAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    final ADMAccountService ADMAccountService;

    public AccountController(ADMAccountService ADMAccountService) {
        this.ADMAccountService = ADMAccountService;
    }

    @PostMapping
    ResponseEntity<String> createAccount(@RequestBody @Valid AccountRequest accountRequest){
        ADMAccountService.createUser(accountRequest);
        return new ResponseEntity<>("Create Account successfully",null, HttpStatus.OK);
    }
//    @PutMapping("/{id}")
//        AccountResponse updateAccount(@RequestBody RegisterAccount registerAccount,@PathVariable Long id){
//            return accountService.updateUser(registerAccount,id);
//    }s

    @GetMapping
        List<AccountResponse> getAllAccount(){
    return  ADMAccountService.getAllUser();
}

    @GetMapping("/{userId}")
    AccountResponse getAllInformationUser(@PathVariable String userId){
        return  ADMAccountService.getUserByID(userId);
    }

//    @DeleteMapping("/{id}")
//    ResponseEntity<String> deleteAccount(@PathVariable Long id){
//        if (ADMAccountService.deleteUser(id)){
//            return new ResponseEntity<>("Delete successfully",null, HttpStatus.OK);
//        }
//        return new ResponseEntity<>("Delete not successfully",null, HttpStatus.BAD_REQUEST);
//    }
}
