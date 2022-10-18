package com.amaris.training.doman;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@NoArgsConstructor
@Data
public class Cart extends DateWapper{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

}
