package com.amaris.training.repository;

import com.amaris.training.doman.Account;
import com.amaris.training.dto.request.RegisterAccount;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByEmail(String email);
    @Query(value = "Select a.email from account a where a.email= :email",nativeQuery = true)
    Account findByEmailAccount(@Param("email")String email);
}
