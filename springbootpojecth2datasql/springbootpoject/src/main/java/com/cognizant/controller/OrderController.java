package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.OrderDetails;
import com.cognizant.service.OrderDetailService;

@RestController
@RequestMapping("/order")
  
public class OrderController {

    @Autowired
    OrderDetailService orderDetailService;

    public ResponseEntity<String> createOrder(@RequestBody OrderDetails orderDetails){
        ResponseEntity<String> resp=null;
        try{
            Integer id = orderDetailService.saveOrderDetails(orderDetails);

            resp = new ResponseEntity<String>(new StringBuffer().append("order create with id").toString(), HttpStatus.CREATED);

        }catch (Exception e){
            resp = new ResponseEntity<String>("Unable to process create order ", HttpStatus.INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
        return resp;
    }
}
