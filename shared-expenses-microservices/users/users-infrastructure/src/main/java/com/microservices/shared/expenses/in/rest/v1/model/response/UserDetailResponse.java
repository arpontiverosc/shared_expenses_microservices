package com.microservices.shared.expenses.in.rest.v1.model.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserDetailResponse {
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
}
