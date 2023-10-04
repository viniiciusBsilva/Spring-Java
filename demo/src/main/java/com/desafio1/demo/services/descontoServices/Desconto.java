package com.desafio1.demo.services.descontoServices;

import org.springframework.stereotype.Service;

@Service
public class Desconto {
    public double descontarValor(double basic, double discount){
        return (basic*discount)/100;
    }
}
