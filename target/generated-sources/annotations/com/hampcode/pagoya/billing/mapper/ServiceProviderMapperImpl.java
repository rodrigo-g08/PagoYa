package com.hampcode.pagoya.billing.mapper;

import com.hampcode.pagoya.billing.dto.ServiceProviderResponse;
import com.hampcode.pagoya.billing.model.ServiceProvider;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-07T09:46:36-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Homebrew)"
)
@Component
public class ServiceProviderMapperImpl implements ServiceProviderMapper {

    @Override
    public ServiceProviderResponse toResponse(ServiceProvider p) {
        if ( p == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = p.getId();
        name = p.getName();

        String category = p.getCategory().name();

        ServiceProviderResponse serviceProviderResponse = new ServiceProviderResponse( id, name, category );

        return serviceProviderResponse;
    }
}
