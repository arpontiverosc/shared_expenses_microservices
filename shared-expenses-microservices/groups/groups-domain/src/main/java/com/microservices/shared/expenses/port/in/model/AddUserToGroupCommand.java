package com.microservices.shared.expenses.port.in.model;

public class AddUserToGroupCommand {


    private final String userId;
    private final String groupId;


    public AddUserToGroupCommand(Builder builder) {
        this.userId = builder.userId;
        this.groupId = builder.groupId;
    }

    public String getUserId() {
        return userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public static final class Builder {
        private String userId;
        private String groupId;

        private Builder() {
        }

        public static Builder anAddUserToGroupCommand() {
            return new Builder();
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public AddUserToGroupCommand build() {
            return new AddUserToGroupCommand(this);
        }
    }
}
