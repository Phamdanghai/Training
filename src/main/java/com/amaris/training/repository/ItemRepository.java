package com.amaris.training.repository;

import com.amaris.training.doman.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
//    @Query(value = "Select i.itemid from item i where i.itemid= :itemID",nativeQuery = true)
    Optional<Item> findByItemID(String itemID);
}
