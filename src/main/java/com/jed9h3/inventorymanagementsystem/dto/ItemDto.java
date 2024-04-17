package com.jed9h3.inventorymanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemDto {
    private Long itemId;
    private String itemName;
    private BigDecimal price;
}
