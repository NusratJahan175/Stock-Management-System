package com.springboot.comweb.repository;

import com.springboot.comweb.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    public Category findByName(String name);

}
