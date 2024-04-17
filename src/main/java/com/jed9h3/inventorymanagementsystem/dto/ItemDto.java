package com.jed9h3.inventorymanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemDto {
    private Long itemId;
    @NotNull(message = "Item name cannot be null")
    private String itemName;
    @NotNull(message = "Price cannot be null")
    private BigDecimal price;
}
