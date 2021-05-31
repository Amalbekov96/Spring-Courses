package com.test.bank.Model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.lang.Object;
import javax.persistence.*;
import java.util.Currency;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "requests")
public class Requests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="supplier_id")
    private Suppliers supplier;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Accounts account;

    @Column(name = "amount", nullable = false)
    private Currency amount;

    @Column(name = "command", nullable = false, length = 5)
    private String command;

    @Column(name = "date", nullable = false)
    private Date date;

    public long getId() {
        return id;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public Accounts getAccount() {
        return account;
    }

    public Currency getAmount() {
        return amount;
    }

    public String getCommand() {
        return command;
    }

    public Date getDate() {
        return date;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setSupplier(Suppliers supplier) {
        this.supplier = supplier;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public void setAmount(Currency amount) {
        this.amount = amount;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
