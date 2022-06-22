package com.cognizant.repository;


import com.cognizant.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer> {

}
