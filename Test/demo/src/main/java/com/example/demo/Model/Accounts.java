package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Accounts")


public class Accounts {
    private long id;
    private long holder_id;
    private double amount;
    private String account_num;

    public Accounts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "holder_id", nullable = false)
    public long getHolder_id() {
        return holder_id;
    }

    public void setHolder_id(long holder_id) {
        this.holder_id = holder_id;
    }

    @Column(name = "amount", nullable = false)
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Column(name = "account_num", nullable = false)
    public String getAccount_num() {
        return account_num;
    }
    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

}
