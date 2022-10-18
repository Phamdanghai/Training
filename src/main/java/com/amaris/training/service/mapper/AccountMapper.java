package com.amaris.training.service.mapper;

import com.amaris.training.doman.Account;
import com.amaris.training.dto.request.RegisterAccount;
import com.amaris.training.dto.response.AccountResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account registerAccountToAccount(RegisterAccount registerAccount);

    AccountResponse AccountToAccountResponse(Account account);
}
