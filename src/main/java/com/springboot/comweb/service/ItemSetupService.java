package com.springboot.comweb.service;

import com.springboot.comweb.entity.Item;

import java.util.List;

public interface ItemSetupService {

    public void save(Item theItem);

    List<Item> findAll();

}
