package com.test.bank.Controller;

import com.test.bank.Dao.RequestDao;
import com.test.bank.Model.Suppliers;
import com.test.bank.Repository.AccountsRepository;
import com.test.bank.Repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class RequestController {
    @Autowired
    SuppliersRepository suppliersRepository;
    @Autowired
    AccountsRepository accountsRepository;


    @PostMapping("/saveSupplier")
    public Suppliers saveSupplier(@RequestBody Suppliers supplier){
        if(supplier == null){
            return new Suppliers();
        } else {
            return suppliersRepository.save(supplier);
        }

    }

    @GetMapping("/allSuppliers")
    public List<Suppliers> getAll (){
        return suppliersRepository.findAll();
    }

    @PostMapping(value = "/check", consumes = "application/json", produces = "application/xml")
    public String check (String request){
        return request;
    }

}
