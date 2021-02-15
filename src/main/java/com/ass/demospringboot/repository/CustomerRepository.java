package com.ass.demospringboot.repository;

import com.ass.demospringboot.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer save(Customer customer);
    List<Customer> findAll();

}
