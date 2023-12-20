package com.microservices.shared.expenses.out.jpa.merger;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserJpaEntityMerger {

    public static void from(User source, UserJpaEntity target) {
        target.setId(source.getId());
        target.setUserName(source.getUserName());
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setEmail(source.getEmail());
    }
}
