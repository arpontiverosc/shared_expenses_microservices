package com.microservices.shared.expenses.port.in.model;

public class DetailGroupQuery {


    private final String id;

    public DetailGroupQuery(Builder builder) {
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public static final class Builder {
        private String id;

        private Builder() {
        }

        public static Builder aDetailGroupQuery() {
            return new Builder();
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public DetailGroupQuery build() {
            return new DetailGroupQuery(this);
        }
    }
}
