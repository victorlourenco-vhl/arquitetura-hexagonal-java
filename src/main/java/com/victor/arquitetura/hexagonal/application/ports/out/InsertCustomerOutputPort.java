package com.victor.arquitetura.hexagonal.application.ports.out;

import com.victor.arquitetura.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
