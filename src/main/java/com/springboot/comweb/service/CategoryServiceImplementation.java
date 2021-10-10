package com.springboot.comweb.service;

import com.springboot.comweb.dto.categorydto;
import com.springboot.comweb.entity.Category;
import com.springboot.comweb.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService{

    public CategoryRepository categoryRepository;

    public CategoryServiceImplementation(CategoryRepository theCategoryRepository) {
        categoryRepository = theCategoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int categoryId) {
        Optional<Category> theCategory = categoryRepository.findById(categoryId);

        return theCategory.get();
    }

    @Override
    public String save(categorydto theCategorydto) {
        Category categoryName = categoryRepository.findByName(theCategorydto.getName());
        if(categoryName != null){
            return "Name already exist";
        }else{
            Category theNewCategory = new Category();
            BeanUtils.copyProperties(theCategorydto, theNewCategory);
            categoryRepository.save(theNewCategory);
            return "Successfully Saved !";
        }

    }

    @Override
    public void deleteById(int categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
