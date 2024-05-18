//package com.amaris.training.dto;
//
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.validator.constraints.Length;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//
//@Data
//@Getter
//@Setter
//public class CatalogDto {
//    @Length(max = 8,message ="Max 8" )
//    @NotBlank(message = "fullName is mandatory")
//    @NotNull(message = "FullName is not null")
//    private String catalogID;
//
//    @NotBlank(message = "fullName is mandatory")
//    @NotNull(message = "FullName is not null")
//    private String catalogName;
//
//    private String description;
//
//    public CatalogDto() {
//    }
//
//    public CatalogDto(String catalogID, String catalogName, String description) {
//        this.catalogID = catalogID;
//        this.catalogName = catalogName;
//        this.description = description;
//    }
//
//    public String getCatalogID() {
//        return catalogID;
//    }
//
//    public void setCatalogID(String catalogID) {
//        this.catalogID = catalogID;
//    }
//
//    public String getCatalogName() {
//        return catalogName;
//    }
//
//    public void setCatalogName(String catalogName) {
//        this.catalogName = catalogName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}
