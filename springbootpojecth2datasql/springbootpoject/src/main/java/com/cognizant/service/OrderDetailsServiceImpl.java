package com.cognizant.service;

import com.cognizant.model.OrderDetails;
import com.cognizant.repository.OrderDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailsServiceImpl implements OrderDetailService{
    @Autowired
    OrderDetailsRepo orderDetailsRepo;

    //Save operation
    @Override
    public Integer saveOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepo.save(orderDetails).getOrderId();
    }
    //getAllorder details
    @Override
    public List<OrderDetails> getOrderDetails() {
        return orderDetailsRepo.findAll();
    }

    @Override
    public OrderDetails getOrderDetailsById(Integer orderId) {
        return  orderDetailsRepo.findById(orderId).get();
    }


    @Override
    public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
        return null;
    }


    // Delete operation
    @Override
    public void deleteOrderDetailsById(Integer orderId) {
        orderDetailsRepo.deleteById(orderId);

    }
}
