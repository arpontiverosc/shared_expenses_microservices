package com.microservices.shared.expenses.in.rest.v1.mapper.response;


import com.microservices.shared.expenses.in.rest.v1.model.response.BalanceAmountResponse;
import com.microservices.shared.expenses.in.rest.v1.model.response.BalanceDetailResponse;
import com.microservices.shared.expenses.in.rest.v1.model.response.PaymentResponse;
import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.model.SettlementPayment;
import com.microservices.shared.expenses.model.UserPaymentSummary;

public class BalanceDetailResponseMapper {
    public static BalanceDetailResponse from(Balance balance) {
        return BalanceDetailResponse.builder()
                                        .id(balance.getId())
                                        .balanceName(balance.getBalanceName())
                                        .description(balance.getDescription())
                                        .groupId(balance.getGroup().getId())
                                        .users(balance.getGroup().getMembersIds().size())
                                        .users(balance.getUserNumberGroup())
                                        .totalAmount(balance.getTotalExpensesAmount())
                                        .amountPerUser(balance.getAmountPerUser())
                                        .balancesAmount(balance.getUsersPaymentSummary().stream().map(BalanceDetailResponseMapper::from).toList())
                                        .payments(balance.getUsersSettlementPayments().stream().map(BalanceDetailResponseMapper::from).toList())
                                        .build();
    }

    private static BalanceAmountResponse from(UserPaymentSummary userPaymentSummary) {
        return BalanceAmountResponse.builder()
                        .userId(userPaymentSummary.getUserId())
                        .amountPaid(userPaymentSummary.getAmountPaid())
                        .amountFinal(userPaymentSummary.getAmountToBePaid())
                        .build();
    }

    private static PaymentResponse from(SettlementPayment settlementPayment) {
        return PaymentResponse.builder()
                            .beneficiaryId(settlementPayment.getBeneficiaryId())
                            .debtorId(settlementPayment.getDebtorId())
                            .amountToPay(settlementPayment.getAmountToPay())
                            .build();
    }
}
