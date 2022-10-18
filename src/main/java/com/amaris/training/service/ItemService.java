package com.amaris.training.service;

import com.amaris.training.dto.ItemDto;
import com.amaris.training.dto.response.ItemResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    ItemResponse createItem(ItemDto itemDto);

    ItemResponse updateItem(ItemDto itemDto,Long id);

    List<ItemResponse> getAllItem();

    boolean deleteItem( Long id);
}
