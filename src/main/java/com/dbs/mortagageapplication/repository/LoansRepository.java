package com.dbs.mortagageapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dbs.mortagageapplication.entity.Loans;

public interface LoansRepository extends JpaRepository<Loans, Integer> {


	@Query(value="SELECT loans.* from loans loans,customer_loans customerloans,customer customer where customer.phone=:phone"
			+ " and loans.loan_id=customerloans.loan_id and customerloans.customer_id=customer.customer_id",nativeQuery=true)
	List<Loans> findByPhone(@Param("phone") long phone);


	List<Loans> findAllByLoanAmountLessThanAndEmiLessThan(double propertyValue, double salary);

}
