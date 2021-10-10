package com.springboot.comweb.repository;

import com.springboot.comweb.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

    public Item findByItemName(String itemName);

}
