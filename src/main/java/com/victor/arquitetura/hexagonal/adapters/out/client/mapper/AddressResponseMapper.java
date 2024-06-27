package com.victor.arquitetura.hexagonal.adapters.out.client.mapper;

import com.victor.arquitetura.hexagonal.adapters.out.client.response.AddressResponse;
import com.victor.arquitetura.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
