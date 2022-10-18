package com.amaris.training.repository;

import com.amaris.training.doman.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Long> {
    //@Query(value = "Select c.catalogid from catalog c where c.catalogid = :catalogID",nativeQuery = true)
    Optional<Catalog> findByCatalogID(String catalogID);
}
