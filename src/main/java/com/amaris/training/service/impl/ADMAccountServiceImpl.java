package com.amaris.training.service.impl;

import com.amaris.training.doman.Madmaccdef;
import com.amaris.training.doman.Madmusrdef;
import com.amaris.training.dto.request.AccountRequest;
import com.amaris.training.exception.NotFoundException;
import com.amaris.training.repository.ADMAccountRepository;
import com.amaris.training.dto.response.AccountResponse;
import com.amaris.training.repository.USRAccountRepository;
import com.amaris.training.service.ADMAccountService;
import com.amaris.training.service.mapper.ADMAccountMapper;
import com.amaris.training.service.mapper.USRAccountMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ADMAccountServiceImpl implements ADMAccountService {

    final ADMAccountRepository ADMAccountRepository;
    final USRAccountRepository usrAccountRepository;

    final ADMAccountMapper admAccountMapper;
    final USRAccountMapper usrAccountMapper;

//    final USRAccountRepository USRAccountRepository;
//
//    final USRAccountMapper USRAccountMapper;


    public ADMAccountServiceImpl(ADMAccountRepository ADMAccountRepository, USRAccountRepository usrAccountRepository, ADMAccountMapper admAccountMapper, USRAccountMapper usrAccountMapper) {
        this.ADMAccountRepository = ADMAccountRepository;
        this.usrAccountRepository = usrAccountRepository;
        this.admAccountMapper = admAccountMapper;
        this.usrAccountMapper = usrAccountMapper;
    }

    @Override
    public AccountResponse createUser(AccountRequest accountRequest) {
        accountRequest.setAccount_id(accountRequest.getUser_id()+ "@"+accountRequest.getDefault_tenant_code());
        accountRequest.setCreate_time(LocalDateTime.now());
        accountRequest.setUpdate_time(LocalDateTime.now());
        System.out.println(accountRequest);
        Madmaccdef account = admAccountMapper.AccountRequestToAccount(accountRequest);
        Optional<Madmaccdef> accountOptional = Optional.ofNullable(ADMAccountRepository.findByAccId(accountRequest.getUser_id()));
        if (accountOptional.isPresent()) {
            throw new NotFoundException("Account is exist");
        }
        Madmusrdef madmusrdef = usrAccountMapper.AccountRequestToAccount(accountRequest);
        usrAccountRepository.save(madmusrdef);
//        account.setCreateDate(LocalDateTime.now());
        ADMAccountRepository.save(account);
        System.out.println(account);
        return admAccountMapper.AccountToAccountResponse(account);
    }

//    @Override
//    public AccountResponse updateUser(RegisterAccount registerAccount, Long id) {
//        Madmaccdef account = accountRepository.findById(id).orElseThrow(
//                () -> new NotFoundException("Not found")
//        );
//        accountMapper.registerAccountToAccount(account, registerAccount);
////        account.setUpdateDate(LocalDateTime.now());
//        accountRepository.save(account);
//        return accountMapper.AccountToAccountResponse(account);
//    }

    @Override
    public List<AccountResponse> getAllUser() {
        List<Madmaccdef> accountList = ADMAccountRepository.findAll();
        if (accountList.isEmpty()) {
            throw new NotFoundException("Not found account");
        }

        List<AccountResponse> accountResponseList = new ArrayList<>();
        accountList.forEach(a -> accountResponseList.add(admAccountMapper.AccountToAccountResponse(a)));
        return accountResponseList;
    }

    @Override
    public AccountResponse getUserByID(String userId) {
        AccountResponse accountResponse = new AccountResponse();

        Madmaccdef madmaccdef = ADMAccountRepository.findByAccId(userId);

        Madmusrdef madmusrdef = usrAccountRepository.findByUserId(userId);
        System.out.println(madmusrdef);
        accountResponse = usrAccountMapper.AccountToUserResponse(madmusrdef);
        System.out.println(accountResponse);
        accountResponse.setPassword(madmaccdef.getPassword());
        accountResponse.setPwd_fail_count(madmaccdef.getPwd_fail_count());
        accountResponse.setDefault_name_tenant_code(madmaccdef.getDefault_tenant_code());
        return accountResponse;
    }


//    @Override
//    public List<AccountResponse> getUserById(String id) {
//        return List.of();
//    }

//    @Override
//    public boolean deleteUser(String id) {
//        Madmaccdef account = ADMAccountRepository.findById(id).orElseThrow(
//                () -> new NotFoundException("Not found account")
//        );
//        ADMAccountRepository.delete(account);
//        return true;
//    }
}
