package com.amaris.training.service.impl;

import com.amaris.training.doman.Catalog;
import com.amaris.training.doman.Item;
import com.amaris.training.dto.ItemDto;
import com.amaris.training.dto.response.ItemResponse;
import com.amaris.training.exception.ExistException;
import com.amaris.training.exception.NotFoundException;
import com.amaris.training.repository.CatalogRepository;
import com.amaris.training.repository.ItemRepository;
import com.amaris.training.service.ItemService;
import com.amaris.training.service.mapper.ItemMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
    final ItemRepository itemRepository;
    final ItemMapper itemMapper;
    final CatalogRepository catalogRepository;

    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper, CatalogRepository catalogRepository) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
        this.catalogRepository = catalogRepository;
    }


    @Override
    public ItemResponse createItem(ItemDto itemDto) {
        Item item = itemMapper.toItem(itemDto);
        Optional<Item> itemOptional = itemRepository.findByItemID(itemDto.getItemID());
        if(itemOptional.isPresent()){
            throw new NotFoundException("Not found");
        }
        item.setCreateDate(LocalDateTime.now());
        itemRepository.save(item);
        return itemMapper.toItemResponse(item);
    }

    @Override
    public ItemResponse updateItem(ItemDto itemDto, Long id) {
        Item item = itemRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Not found Item")
        );
        Optional<Item> itemOptional = itemRepository.findByItemID(itemDto.getItemID());
        if(itemOptional.isEmpty() || item.getItemID().equals(itemDto.getItemID())){
            itemMapper.toItem(item,itemDto);
            item.setUpdateDate(LocalDateTime.now());
            itemRepository.save(item);
            return itemMapper.toItemResponse(item);
        }
        throw new ExistException("Item is exist");
    }

    @Override
    public List<ItemResponse> getAllItem() {
        List<Item> itemList = itemRepository.findAll();
        if(itemList.isEmpty()){
            throw new NotFoundException("Nor found");
        }
        List<ItemResponse> itemResponseList = new ArrayList<>();
        itemList.forEach(i -> itemResponseList.add(itemMapper.toItemResponse(i)));
        return itemResponseList;
//        return itemList.stream().map(ItemResponse::buildItemResponse).collect(Collectors.toList());
    }

    @Override
    public boolean deleteItem(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Not found")
        );
        itemRepository.delete(item);
        return true;
    }
}
