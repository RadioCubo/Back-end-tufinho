package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titular;
    private BigDecimal valor;
    protected Conta() {
// construtor vazio exigido pelo JPA/Hibernate
    }
    public Conta(String titular, BigDecimal valor) {
        this.titular = titular;
        this.valor = valor;
    }
    public Long getId() {
        return id;
    }
    public String getTitular() {
        return titular;
    }
    public BigDecimal getValor() {
        return valor;
    }

    }