package com.microservices.shared.expenses.port.in.model;


public class DetailBalanceQuery {
    private final String id;

    private DetailBalanceQuery(Builder builder) {
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public static final class Builder {
        private String id;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public DetailBalanceQuery build() {
            return new DetailBalanceQuery(this);
        }
    }
}
