package com.amaris.training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemDto {
    private String itemID;
    private String itemName;
    private Long catalogId;
}
