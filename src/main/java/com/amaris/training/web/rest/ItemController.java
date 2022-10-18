package com.amaris.training.web.rest;

import com.amaris.training.dto.ItemDto;
import com.amaris.training.dto.response.ItemResponse;
import com.amaris.training.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    final ItemService itemService;


    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    ItemResponse createItem(@RequestBody ItemDto itemDto){
        return itemService.createItem(itemDto);
    }

    @PutMapping("/{id}")
    ItemResponse updateItem(@RequestBody ItemDto itemDto,@PathVariable Long id){
        return itemService.updateItem(itemDto,id);
    }
    @GetMapping
    List<ItemResponse> getAllItem(){
        return itemService.getAllItem();
    }
    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteItem(Long id){
        if(itemService.deleteItem(id)){
            return new ResponseEntity<>("DELETE SUCCESSFULLY",null, HttpStatus.OK);
        }
        return new ResponseEntity<>("DELETE FAIL",null, HttpStatus.BAD_REQUEST);
    }
}
