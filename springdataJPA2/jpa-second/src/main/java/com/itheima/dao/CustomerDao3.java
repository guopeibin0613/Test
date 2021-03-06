package com.itheima.dao;

import com.itheima.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerDao3 extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {
}
