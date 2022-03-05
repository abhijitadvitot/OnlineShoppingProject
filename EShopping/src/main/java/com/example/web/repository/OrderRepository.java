package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long>{

}