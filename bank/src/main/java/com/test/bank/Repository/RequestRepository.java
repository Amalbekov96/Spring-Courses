package com.test.bank.Repository;

import com.test.bank.Model.Requests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Requests, Long> {

}
