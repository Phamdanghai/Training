package com.amaris.training.service.mapper;

import com.amaris.training.doman.Madmaccdef;
import com.amaris.training.doman.Madmusrdef;
import com.amaris.training.dto.request.AccountRequest;
import com.amaris.training.dto.response.AccountResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface USRAccountMapper {
    Madmusrdef AccountRequestToAccount(AccountRequest accountRequest);

    AccountResponse AccountToUserResponse(Madmusrdef userAcc);

//    Madmaccdef registerAccountToAccount(@MappingTarget Madmaccdef account, RegisterAccount registerAccount);
}
