package com.amaris.training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class ItemDto {
    @NotBlank(message = "fullName is mandatory")
    @NotNull(message = "FullName is not null")
    private String itemID;
    @NotBlank(message = "fullName is mandatory")
    @NotNull(message = "FullName is not null")
    private String itemName;
    private Long catalogId;
}
