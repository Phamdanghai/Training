package com.amaris.training.repository;

import com.amaris.training.doman.Madmaccdef;
import com.amaris.training.doman.Madmusrdef;
import com.amaris.training.dto.response.AccountResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ADMAccountRepository extends JpaRepository<Madmaccdef,String> {
    @Query(value = "Select * from madmaccdef adm WHERE adm.user_id = :user_id",nativeQuery = true)
    Madmaccdef findByAccId(@Param("user_id") String user_id);
    @Query(value = "Select * from madmaccdef adm WHERE adm.user_id = :user_id",nativeQuery = true)
    List<Madmaccdef> findAccByUserId(@Param("user_id") String user_id);
    @Query(value = "Select * from madmaccdef adm WHERE adm.user_desc = :user_desc",nativeQuery = true)
    List<Madmaccdef> findAccByUserDesc(@Param("user_desc") String user_desc);
}
