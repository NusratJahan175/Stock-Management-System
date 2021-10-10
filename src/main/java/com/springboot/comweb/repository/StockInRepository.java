package com.springboot.comweb.repository;

import com.springboot.comweb.entity.StockIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInRepository extends JpaRepository<StockIn, Integer> {
}
