package com.cognizant.service;

import com.cognizant.model.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderDetailService {

    //save operation
    Integer saveOrderDetails(OrderDetails orderDetails);

    // Read operation
    List<OrderDetails> getOrderDetails();
    OrderDetails getOrderDetailsById(Integer orderId);

    // Update operation
    OrderDetails updateOrderDetails(OrderDetails orderDetails);

    // Delete operation
    void deleteOrderDetailsById(Integer orderId);

}
