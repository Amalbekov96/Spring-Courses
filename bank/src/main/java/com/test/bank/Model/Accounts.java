package com.test.bank.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "account", nullable = false, length = 12)
    private String account;

    @Column(name = "supplier_id")
    private long supplier_id;

    @Column(name = "amount")
    private String amount;

    @OneToMany(targetEntity = Requests.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "account_id")
    private List<Requests> requests;

    public long getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public long getSupplier_id() {
        return supplier_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Requests> getRequests() {
        return requests;
    }

    public void setRequests(List<Requests> requests) {
        this.requests = requests;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setSupplier_id(long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}