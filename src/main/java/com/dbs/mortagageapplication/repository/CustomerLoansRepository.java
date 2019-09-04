package com.dbs.mortagageapplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.dbs.mortagageapplication.entity.CustomerLoans;



public interface CustomerLoansRepository extends JpaRepository<CustomerLoans, Integer>{
	

}
