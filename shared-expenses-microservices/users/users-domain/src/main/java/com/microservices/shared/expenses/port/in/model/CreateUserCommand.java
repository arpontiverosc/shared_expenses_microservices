package com.microservices.shared.expenses.port.in.model;

public class CreateUserCommand {

    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String email;

    private CreateUserCommand(Builder builder) {
        this.userName = builder.userName;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static final class Builder {
        private String userName;
        private String firstName;
        private String lastName;
        private String email;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public CreateUserCommand build() {
            return new CreateUserCommand(this);
        }
    }
}
