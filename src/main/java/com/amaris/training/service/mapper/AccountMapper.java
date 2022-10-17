package com.amaris.training.service.mapper;

import com.amaris.training.doman.Account;
import com.amaris.training.request.RegisterAccount;
import com.amaris.training.response.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account registerAccountToAccount(RegisterAccount registerAccount);
    @Mapping(target = "lastName")
    AccountResponse AccountToAccountResponse(Account account);
}
