package com.hampcode.pagoya.customer.mapper;

import com.hampcode.pagoya.customer.dto.CustomerResponse;
import com.hampcode.pagoya.customer.model.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-07T09:46:36-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Homebrew)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerResponse toResponse(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Long id = null;
        String fullName = null;
        String dni = null;
        String phone = null;
        Long userId = null;

        id = customer.getId();
        fullName = customer.getFullName();
        dni = customer.getDni();
        phone = customer.getPhone();
        userId = customer.getUserId();

        CustomerResponse customerResponse = new CustomerResponse( id, fullName, dni, phone, userId );

        return customerResponse;
    }
}
