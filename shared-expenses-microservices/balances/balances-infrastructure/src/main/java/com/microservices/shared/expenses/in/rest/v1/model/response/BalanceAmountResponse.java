package com.microservices.shared.expenses.in.rest.v1.model.response;

import lombok.*;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BalanceAmountResponse {

    private String userId;
    private BigDecimal amountPaid;
    private BigDecimal amountFinal;
}
