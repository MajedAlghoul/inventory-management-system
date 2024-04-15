package com.jed9h3.inventorymanagementsystem.dto;

import lombok.Data;

@Data
public class OrderDto {
    private Long orderID;
    private Long itemID;
    private Long customerID;
    private Long orderedQuantity;
}
