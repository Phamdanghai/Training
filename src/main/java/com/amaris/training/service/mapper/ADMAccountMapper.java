package com.amaris.training.service.mapper;

import com.amaris.training.doman.Madmaccdef;
import com.amaris.training.dto.request.AccountRequest;
import com.amaris.training.dto.response.AccountResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ADMAccountMapper {
    Madmaccdef AccountRequestToAccount(AccountRequest accountRequest);

    AccountResponse AccountToAccountResponse(Madmaccdef account);

//    Madmaccdef registerAccountToAccount(@MappingTarget Madmaccdef account, RegisterAccount registerAccount);
}
