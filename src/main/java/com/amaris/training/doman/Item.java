package com.amaris.training.doman;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@Table
public class Item extends DateWapper{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private String itemID;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private Collection<Cart> cartCollection;


}
