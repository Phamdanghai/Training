package com.amaris.training.dto.request;

import lombok.*;


@Data
@NoArgsConstructor
public class RegisterAccount {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;


}
