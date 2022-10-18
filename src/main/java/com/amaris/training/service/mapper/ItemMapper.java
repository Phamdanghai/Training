package com.amaris.training.service.mapper;

import com.amaris.training.doman.Account;
import com.amaris.training.doman.Item;
import com.amaris.training.dto.ItemDto;
import com.amaris.training.dto.request.RegisterAccount;
import com.amaris.training.dto.response.AccountResponse;
import com.amaris.training.dto.response.ItemResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mapping( source= "catalogId",target = "catalog.catalogID")
    Item toItem(ItemDto itemDto);
    @Mapping(source = "catalog.catalogID",target = "catalogID")
    @Mapping(source = "catalog.description",target = "description")
    ItemResponse toItemResponse(Item item);

    @Mapping( source= "catalogId",target = "catalog.catalogID")
    Item toItem(@MappingTarget Item item, ItemDto itemDto);
}
