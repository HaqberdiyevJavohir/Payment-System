package com.example.paymentsysteminjava.repository;

import com.example.paymentsysteminjava.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
    @Query("select u from UserEntity u where u.id = ?1 and u.isActive = true")
    Optional<UserEntity> checkUser(Long id);
}
