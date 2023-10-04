package com.desafio1.demo.services;

import com.desafio1.demo.entities.Order;
import com.desafio1.demo.services.descontoServices.Desconto;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private Order order;
    private Desconto desconto;

    public OrderService(Desconto desconto){
        this.desconto = desconto;
    }
    public double total(Order order){
        return order.getBasic()-desconto.descontarValor(order.getBasic(), order.getDiscount());
    }
}
