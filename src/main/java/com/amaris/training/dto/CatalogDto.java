package com.amaris.training.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@Getter
@Setter
public class CatalogDto {
    @Length(max = 8,message ="Max 8" )
    private String catalogID;

    private String catalogName;

    private String description;
}
