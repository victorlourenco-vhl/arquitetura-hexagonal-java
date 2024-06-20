package com.victor.arquitetura.hexagonal.application.ports.out;

import com.victor.arquitetura.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
