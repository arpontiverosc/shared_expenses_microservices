package com.microservices.shared.expenses.port.in.model;

import lombok.*;

import java.math.BigDecimal;

public class AddExpenseToBalanceCommand {

    private final String balanceId;
    private final String userId;
    private final String groupId;
    private final BigDecimal price;
    private final String currency;
    private final String description;

    private AddExpenseToBalanceCommand(Builder builder) {
        this.balanceId = builder.balanceId;
        this.userId = builder.userId;
        this.groupId = builder.groupId;
        this.price = builder.price;
        this.currency = builder.currency;
        this.description = builder.description;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public String getUserId() {
        return userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDescription() {
        return description;
    }


    public static final class Builder {
        private String balanceId;
        private String userId;
        private String groupId;
        private BigDecimal price;
        private String currency;
        private String description;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder balanceId(String balanceId) {
            this.balanceId = balanceId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public AddExpenseToBalanceCommand build() {
            return new AddExpenseToBalanceCommand(this);
        }
    }
}
