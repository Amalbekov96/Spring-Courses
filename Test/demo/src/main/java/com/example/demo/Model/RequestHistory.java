package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Suppplier")
public class RequestHistory {

    private long id;
    private long supplier_id;
    private String account_id;
    private double amount;
    private String request_type;
    private String date_time;

    public RequestHistory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "supplier_id", nullable = false)
    public long getSupplier_id() {
        return supplier_id;
    }
    public void setSupplier_id(long supplier_id) {
        this.supplier_id = supplier_id;
    }

    @Column(name = "account_id", nullable = false)
    public String getAccount_id() {
        return account_id;
    }
    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    @Column(name = "amount", nullable = false)
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Column(name = "request_type", nullable = false)
    public String getRequest_type() {
        return request_type;
    }
    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    @Column(name = "date_time", nullable = false)
    public String getDate_time() {
        return date_time;
    }
    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
}
