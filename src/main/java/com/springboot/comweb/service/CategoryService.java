package com.springboot.comweb.service;

import com.springboot.comweb.dto.categorydto;
import com.springboot.comweb.entity.Category;
import com.springboot.comweb.entity.Company;

import java.util.List;

public interface CategoryService {

    public List<Category> findAll();
    public Category findById(int categoryId);
    public String save(categorydto theCategorydto);
    public void deleteById(int categoryId);
}
