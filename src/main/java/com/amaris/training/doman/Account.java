package com.amaris.training.doman;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@Table
public class Account extends DateWapper{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
    private Collection<Item> itemCollection;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
    private Collection<Cart> cartCollection;

}
