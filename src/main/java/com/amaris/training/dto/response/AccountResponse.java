package com.amaris.training.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AccountResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDateTime createDate;
}
