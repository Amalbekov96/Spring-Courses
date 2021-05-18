package com.example.demo.Controller;

import com.example.demo.Model.RequestHistory;
import com.example.demo.Model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class SupplierController {
    @Autowired
    private SupplierController supplierController;

    RequestHistory requestHistory;

    @GetMapping(value = "/check", consumes = "application/json", produces= MediaType.APPLICATION_XML_VALUE)
    public RequestHistory check(@RequestBody RequestHistory request1) {

        return null;
    }

    @PostMapping(value = "/pay", consumes = "application/json", produces= MediaType.APPLICATION_XML_VALUE)
    public RequestHistory pay(@RequestBody RequestHistory request1) {



        return null;
    }


}
