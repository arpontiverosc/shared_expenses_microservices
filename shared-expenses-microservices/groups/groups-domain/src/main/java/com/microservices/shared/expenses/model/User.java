package com.microservices.shared.expenses.model;


public class User {
    private final String id;

    public User(Builder builder) {
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

        public User build() {
            return new User(this);
        }
    }
}
