package com.springboot.comweb.controller;

import com.springboot.comweb.entity.Company;
import com.springboot.comweb.entity.Item;
import com.springboot.comweb.entity.StockIn;
import com.springboot.comweb.service.CompanyService;
import com.springboot.comweb.service.ItemSetupService;
import com.springboot.comweb.service.StockInService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StockInController {

    public StockInService stockInService;
    public CompanyService companyService;
    public ItemSetupService itemSetupService;

    public StockInController(StockInService stockInService, CompanyService companyService, ItemSetupService itemSetupService) {
        this.stockInService = stockInService;
        this.companyService = companyService;
        this.itemSetupService = itemSetupService;
    }

    @GetMapping("/showStockInForm")
    public String showStockInForm(Model theModel){
        List<Company> theCompanies = companyService.findAll();
        theModel.addAttribute("companyList", theCompanies);
        List<Item> theItems= itemSetupService.findAll();
        theModel.addAttribute("itemList", theItems);

        theModel.addAttribute("newStock", new StockIn());
        return "stock-in-form";
    }
}
