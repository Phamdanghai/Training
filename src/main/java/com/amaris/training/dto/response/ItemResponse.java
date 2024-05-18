//package com.amaris.training.dto.response;
//
//import com.amaris.training.doman.Item;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Data
//public class ItemResponse {
//    private String itemID;
//    private String itemName;
//    private String description;
//    private String catalogID;
//    private LocalDateTime createDate;
//
//    public static ItemResponse buildItemResponse(Item item){
//        return new ItemResponse(
//                item.getItemID(),
//                item.getItemName(),
//                item.getCatalog().getDescription(),
//                item.getCatalog().getCatalogID(),
//                item.getCreateDate()
//        );
//    }
//
//    public ItemResponse() {
//    }
//
//    public ItemResponse(String itemID, String itemName, String description, String catalogID, LocalDateTime createDate) {
//        this.itemID = itemID;
//        this.itemName = itemName;
//        this.description = description;
//        this.catalogID = catalogID;
//        this.createDate = createDate;
//    }
//
//    public String getItemID() {
//        return itemID;
//    }
//
//    public void setItemID(String itemID) {
//        this.itemID = itemID;
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
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
//    public LocalDateTime getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(LocalDateTime createDate) {
//        this.createDate = createDate;
//    }
//}
