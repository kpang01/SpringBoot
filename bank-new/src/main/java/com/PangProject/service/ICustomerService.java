package com.PangProject.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.PangProject.entity.CustomerEntity;

public interface ICustomerService {
    CustomerEntity createCustomer(CustomerEntity customer);
    Optional<CustomerEntity> getCustomerById(Long id);
    List<CustomerEntity> getAllCustomers();
    CustomerEntity updateCustomer(Long id, CustomerEntity updatedCustomer);
    void deleteCustomer(Long id);
	List<CustomerEntity> getCustomersByDescriptionAndCreationDateBetween(String description, LocalDateTime startDate,
			LocalDateTime endDate);
}
