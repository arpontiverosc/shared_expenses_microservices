package com.microservices.shared.expenses.port.in.model;


public class CreateBalanceCommand {
    private final String balanceName;
    private final String description;
    private final String groupId;

    private CreateBalanceCommand(Builder builder) {
        this.balanceName = builder.balanceName;
        this.description = builder.description;
        this.groupId = builder.groupId;
    }

    public String getBalanceName() {
        return balanceName;
    }

    public String getDescription() {
        return description;
    }

    public String getGroupId() {
        return groupId;
    }


    public static final class Builder {
        private String balanceName;
        private String description;
        private String groupId;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder balanceName(String balanceName) {
            this.balanceName = balanceName;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public CreateBalanceCommand build() {
            return new CreateBalanceCommand(this);
        }
    }
}
