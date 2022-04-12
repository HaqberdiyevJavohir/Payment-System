package com.example.paymentsysteminjava.repository;

import com.example.paymentsysteminjava.entity.MerchantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<MerchantEntity, Long> {
}
