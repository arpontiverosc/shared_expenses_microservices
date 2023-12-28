package com.microservices.shared.expenses.out.jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "outbox")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class OutboxJpaEntity {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String aggregate;
    private String operation;
    private String message;

    /*@ManyToMany
    @JoinTable(
            name = "users_groups",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<GroupJpaEntity> groups;*/

}
