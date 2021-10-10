package com.springboot.comweb.controller;

import com.springboot.comweb.entity.Category;
import com.springboot.comweb.entity.Company;
import com.springboot.comweb.entity.Item;
import com.springboot.comweb.service.CategoryService;
import com.springboot.comweb.service.CompanyService;
import com.springboot.comweb.service.ItemSetupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ItemSetupController {

    public ItemSetupService itemSetupService;
    public CategoryService categoryService;
    public CompanyService companyService;

    public ItemSetupController(ItemSetupService itemSetupService, CategoryService categoryService, CompanyService companyService) {
        this.itemSetupService = itemSetupService;
        this.categoryService = categoryService;
        this.companyService = companyService;
    }

    @GetMapping("/showItemsSetupForm")
    public String showItemsSetupForm(Model theModel){
        List<Category> theCategories = categoryService.findAll();
        theModel.addAttribute("categoryList", theCategories);
        List<Company> theCompanies = companyService.findAll();
        theModel.addAttribute("companyList", theCompanies);
        theModel.addAttribute("theItem", new Item());
        return "item-form";
    }

    @PostMapping("/saveNewItem")
    public String saveNewItem(@ModelAttribute("newItems") Item newItems){
        itemSetupService.save(newItems);
        return "redirect:/showItemsSetupForm";
    }
}
