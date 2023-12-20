package com.microservices.shared.expenses.out.jpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserJpaEntity {

    @Id
    @EqualsAndHashCode.Include private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "users_groups",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<GroupJpaEntity> groups;

}
