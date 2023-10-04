package com.desafio1.demo;

import com.desafio1.demo.entities.Order;
import com.desafio1.demo.services.OrderService;
import com.desafio1.demo.services.descontoServices.Desconto;
import com.desafio1.demo.services.ShippingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		//Order order = new Order(1034,150.00,20.0);
		//Order order = new Order(2282,800.00,10.0);
		Order order = new Order(1309,95.90,0.0);
		Desconto desconto = new Desconto();
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(desconto);
		System.out.printf("Pedido Código "+ order.getCode());
		System.out.println();
		System.out.printf("Valor Total: R$%.2f ", (orderService.total(order)+shippingService.shipment(order)));
	}

}
