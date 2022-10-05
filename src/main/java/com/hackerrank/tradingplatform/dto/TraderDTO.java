package com.hackerrank.tradingplatform.dto;

import com.hackerrank.tradingplatform.model.Trader;

import java.sql.Timestamp;

public class TraderDTO {
    private  Long id;
    private  String name;
    private  String email;
    private  Double balance;

    private  Timestamp createdAt;
    private  Timestamp updatedAt;

    public TraderDTO(Long id, String name, String email, Double balance, Timestamp createdAt, Timestamp updatedAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.balance=balance;
        this.createdAt =createdAt;
        this.updatedAt = updatedAt;

    }

    public TraderDTO(Trader trader) {
        this.id = trader.getId();
        this.name = trader.getName();
        this.email = trader.getEmail();
        this.balance = trader.getBalance();
        this.createdAt = trader.getCreatedAt();
        this.updatedAt = trader.getUpdatedAt();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }
}
