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
@Table(name = "suppliers")
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @OneToMany(targetEntity = Accounts.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "supplier_id")
    private List<Accounts> accounts;

    @OneToMany(targetEntity = Requests.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "supplier_id")
    private List<Requests> requests;

    public List<Requests> getRequests() {
        return requests;
    }

    public void setRequests(List<Requests> requests) {
        this.requests = requests;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}


//{
//        "supplier": {
//        "name": "Kushtar",
//        "accounts" : [
//        {
//        "account": "12344",
//        "amount" : "234343"
//        },
//        {
//        "account": "23",
//        "amount" : "234"
//        }
//        ]
//        }
//        }