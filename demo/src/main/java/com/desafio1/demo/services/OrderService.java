package com.desafio1.demo.services;

import com.desafio1.demo.entities.Order;
import com.desafio1.demo.services.descontoServices.Desconto;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private Desconto desconto;
    private ShippingService shippingService;

    public OrderService(Desconto desconto, ShippingService shippingService) {
        this.desconto = desconto;
        this.shippingService = shippingService;
    }

    public double total(Order order){
        return (order.getBasic()-desconto.descontarValor(order.getBasic(), order.getDiscount()))+shippingService.shipment(order);
    }
}
