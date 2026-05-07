package com.hampcode.pagoya.transfer.mapper;

import com.hampcode.pagoya.transfer.dto.TransferResponse;
import com.hampcode.pagoya.transfer.model.Transfer;
import com.hampcode.pagoya.transfer.model.TransferStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-07T09:46:36-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Homebrew)"
)
@Component
public class TransferMapperImpl implements TransferMapper {

    @Override
    public TransferResponse toResponse(Transfer transfer) {
        if ( transfer == null ) {
            return null;
        }

        Long id = null;
        String sourceAccountNumber = null;
        String targetAccountNumber = null;
        BigDecimal amount = null;
        String currency = null;
        BigDecimal exchangeRate = null;
        TransferStatus status = null;
        LocalDateTime createdAt = null;

        id = transfer.getId();
        sourceAccountNumber = transfer.getSourceAccountNumber();
        targetAccountNumber = transfer.getTargetAccountNumber();
        amount = transfer.getAmount();
        currency = transfer.getCurrency();
        exchangeRate = transfer.getExchangeRate();
        status = transfer.getStatus();
        createdAt = transfer.getCreatedAt();

        TransferResponse transferResponse = new TransferResponse( id, sourceAccountNumber, targetAccountNumber, amount, currency, exchangeRate, status, createdAt );

        return transferResponse;
    }
}
