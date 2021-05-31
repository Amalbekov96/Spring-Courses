package com.test.bank.Dao;

import com.test.bank.Model.Suppliers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestDao {
    private Suppliers supllier;
}
