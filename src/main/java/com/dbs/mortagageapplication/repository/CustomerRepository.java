package com.dbs.mortagageapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.mortagageapplication.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
