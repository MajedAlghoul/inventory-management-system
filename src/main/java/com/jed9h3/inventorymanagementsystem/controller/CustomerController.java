package com.jed9h3.inventorymanagementsystem.controller;

import com.jed9h3.inventorymanagementsystem.dto.CustomerDto;
import com.jed9h3.inventorymanagementsystem.service.CustomerService;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
