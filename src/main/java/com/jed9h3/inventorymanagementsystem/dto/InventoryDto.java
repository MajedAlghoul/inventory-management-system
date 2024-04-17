package com.jed9h3.inventorymanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class InventoryDto {
    private Long itemId;
    private Long availableQuantity;
}
