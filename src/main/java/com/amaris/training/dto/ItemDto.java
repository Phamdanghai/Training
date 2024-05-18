package com.amaris.training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemDto {
    @NotBlank(message = "fullName is mandatory")
    @NotNull(message = "FullName is not null")
    private String itemID;
    @NotBlank(message = "fullName is mandatory")
    @NotNull(message = "FullName is not null")
    private String itemName;
    private Long catalogId;

    public ItemDto() {
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }
}
