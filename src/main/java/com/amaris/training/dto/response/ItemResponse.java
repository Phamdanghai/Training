package com.amaris.training.dto.response;

import com.amaris.training.doman.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponse {
    private String itemID;
    private String itemName;
    private String description;
    private String catalogID;
    private LocalDateTime createDate;

    public static ItemResponse buildItemResponse(Item item){
        return new ItemResponse(
                item.getItemID(),
                item.getItemName(),
                item.getCatalog().getDescription(),
                item.getCatalog().getCatalogID(),
                item.getCreateDate()
        );
    }
}
