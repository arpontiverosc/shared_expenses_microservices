package com.microservices.shared.expenses.in.rest.v1.model.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class BalanceDetailResponse {


    private String id;
    private String balanceName;
    private String description;
    private String groupId;
    private int users;
    private BigDecimal totalAmount;
    private BigDecimal amountPerUser;
    private List<BalanceAmountResponse> balancesAmount;
    private List<PaymentResponse> payments;

}
