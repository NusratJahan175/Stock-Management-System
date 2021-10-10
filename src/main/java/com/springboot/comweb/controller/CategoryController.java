package com.springboot.comweb.controller;

import com.springboot.comweb.dto.categorydto;
import com.springboot.comweb.entity.Category;
import com.springboot.comweb.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {

    public CategoryService categoryService;

    public CategoryController(CategoryService theCategoryService) {
        categoryService = theCategoryService;
    }

    @GetMapping("/category")
    public String showCategory(Model theModel){
        List<Category> theCategories = categoryService.findAll();
        theModel.addAttribute("categoryList", theCategories);
        theModel.addAttribute("category", new Category());

        return "category-list";
    }

    @PostMapping("/saveCategory")
    public String saveCategoryName(@ModelAttribute(name = "theCategory") categorydto theCategorydto, Model model){
        String message= categoryService.save(theCategorydto);
        model.addAttribute("message",message);
        return "redirect:/category";
    }
    @PostMapping("/updateCategory")
    public String updateCategoryName(@ModelAttribute(name = "theCategory") categorydto theCategorydto, Model model){
        String updatedName = categoryService.save(theCategorydto);
        return "redirect:/category";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("categoryId") int theId, Model theModel){

        Category theCategory = categoryService.findById(theId);
        theModel.addAttribute("category" , theCategory);

        return "update-category-list";

    }
    @GetMapping("/delete")
    public String delete(@RequestParam("categoryId") int theId){
        categoryService.deleteById(theId);
        return "redirect:/category";

    }


}
