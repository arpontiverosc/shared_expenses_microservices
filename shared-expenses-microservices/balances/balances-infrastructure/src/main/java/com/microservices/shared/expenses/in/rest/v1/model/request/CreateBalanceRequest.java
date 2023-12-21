package com.microservices.shared.expenses.in.rest.v1.model.request;


import com.microservices.shared.expenses.util.BalanceErrorCode;
import com.microservices.shared.expenses.util.BalanceFieldValidation;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateBalanceRequest {

    @NotNull(message = BalanceErrorCode.BALANCE_NAME_MANDATORY)
    @Size(min = BalanceFieldValidation.BALANCE_NAME_MIN_LENGTH, message = BalanceErrorCode.BALANCE_NAME_MIN_LENGTH)
    @Size(max = BalanceFieldValidation.BALANCE_NAME_MAX_LENGTH, message = BalanceErrorCode.BALANCE_NAME_MAX_LENGTH)
    private String balanceName;

    @NotNull(message = BalanceErrorCode.BALANCE_DESCRIPTION_MANDATORY)
    @Size(min = BalanceFieldValidation.BALANCE_DESCRIPTION_MIN_LENGTH, message = BalanceErrorCode.BALANCE_DESCRIPTION_MIN_LENGTH)
    @Size(max = BalanceFieldValidation.BALANCE_DESCRIPTION_MAX_LENGTH, message = BalanceErrorCode.BALANCE_DESCRIPTION_MAX_LENGTH)
    private String description;

    @NotNull(message = BalanceErrorCode.BALANCE_GROUP_ID_MANDATORY)
    private String groupId;


}
