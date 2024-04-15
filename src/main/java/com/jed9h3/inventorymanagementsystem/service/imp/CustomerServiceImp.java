package com.jed9h3.inventorymanagementsystem.service.imp;

import com.jed9h3.inventorymanagementsystem.dto.CustomerDto;
import com.jed9h3.inventorymanagementsystem.entity.Customer;
import com.jed9h3.inventorymanagementsystem.exception.NoContentException;
import com.jed9h3.inventorymanagementsystem.repository.CustomerRepository;
import com.jed9h3.inventorymanagementsystem.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty()) {
            throw new NoContentException("No customers registered yet");
        }
        return customers.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private CustomerDto convertToDto(Customer customer) {
        CustomerDto result = new CustomerDto();
        result.setCustomerID(customer.getCustomerID());
        result.setCustomerName(customer.getCustomerName());
        result.setBalance(customer.getBalance());
        return result;
    }
}
