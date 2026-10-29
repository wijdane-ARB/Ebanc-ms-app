package ma.enset.security.customerservice.service;


import ma.enset.security.customerservice.entities.Customer;
import ma.enset.security.customerservice.repositories.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
    public Customer findCustomerById(Long id) {
        return customerRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

}
