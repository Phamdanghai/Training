package com.amaris.training.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Getter
@Setter
public class CatalogDto {
    @Length(max = 8,message ="Max 8" )
    @NotBlank(message = "fullName is mandatory")
    @NotNull(message = "FullName is not null")
    private String catalogID;

    @NotBlank(message = "fullName is mandatory")
    @NotNull(message = "FullName is not null")
    private String catalogName;

    private String description;
}
