package com.microservices.shared.expenses.port.in.model;


public class DetailUserQuery {

    private final String id;

    public DetailUserQuery(Builder builder) {
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

        public DetailUserQuery build() {
            return new DetailUserQuery(this);
        }
    }
}
