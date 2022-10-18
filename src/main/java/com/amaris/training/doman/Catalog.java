package com.amaris.training.doman;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
@NoArgsConstructor
public class Catalog extends DateWapper{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String catalogName;
    private String description;
    private String catalogID;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "catalog")
    private Collection<Item> itemCollection;


}
