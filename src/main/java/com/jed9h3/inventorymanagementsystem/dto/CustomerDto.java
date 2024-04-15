package com.jed9h3.inventorymanagementsystem.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CustomerDto {
    private Long customerID;
    private String customerName;
    private BigDecimal balance;
}
