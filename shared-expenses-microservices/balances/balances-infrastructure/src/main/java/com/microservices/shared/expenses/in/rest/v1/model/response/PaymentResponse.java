package com.microservices.shared.expenses.in.rest.v1.model.response;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PaymentResponse {

    private String beneficiaryId;
    private String debtorId;
    private BigDecimal amountToPay;

}
