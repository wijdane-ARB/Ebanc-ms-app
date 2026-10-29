package ma.enset.security.customerservice.controllers;


import ma.enset.security.customerservice.entities.Customer;
import ma.enset.security.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    public Customer findCustomerById(Long id) {
        return customerService.findCustomerById(id);
    }
    public Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }


}
