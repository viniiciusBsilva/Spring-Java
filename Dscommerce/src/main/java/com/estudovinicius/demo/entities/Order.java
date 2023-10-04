package com.estudovinicius.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
@Table(name="tb_Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private OrderStatus orderStatus;
    @ManyToOne
    @JoinColumn(name="client_id")
    private User client;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client, Payment payment) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
        this.payment = payment;
    }

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public User getClient() {
        return client;
    }

    public Payment getPayment() {
        return payment;
    }
}
