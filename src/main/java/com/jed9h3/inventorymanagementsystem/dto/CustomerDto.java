package com.jed9h3.inventorymanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CustomerDto {
    private Long customerId;
    @NotNull(message = "Customer name cannot be null")
    private String customerName;
    @NotNull(message = "Balance cannot be null")
    private BigDecimal balance;
}
