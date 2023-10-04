package com.desafio1.demo.services;

import com.desafio1.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.getBasic()<100){
            return 20.0;
        }if(order.getBasic()<200&&order.getBasic()>100){
            return 12.0;
        }else {
            return 0;
        }
    }
}
