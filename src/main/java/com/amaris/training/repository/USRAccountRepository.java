package com.amaris.training.repository;

import com.amaris.training.doman.Madmusrdef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface USRAccountRepository extends JpaRepository<Madmusrdef,String> {
    @Query(value = "Select * from madmusrdef adm WHERE adm.user_id = :user_id",nativeQuery = true)
    Madmusrdef findByUserId(@Param("user_id") String user_id);
}
