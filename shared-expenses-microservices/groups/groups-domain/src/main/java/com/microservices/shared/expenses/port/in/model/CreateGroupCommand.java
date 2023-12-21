package com.microservices.shared.expenses.port.in.model;


public class CreateGroupCommand {

    private final String groupName;

    public CreateGroupCommand(Builder builder) {
        this.groupName = builder.groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public static final class Builder {
        private String groupName;

        private Builder() {
        }

        public static Builder aCreateGroupCommand() {
            return new Builder();
        }

        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        public CreateGroupCommand build() {
            return new CreateGroupCommand(this);
        }
    }
}
