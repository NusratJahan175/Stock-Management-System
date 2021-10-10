package com.springboot.comweb.controller;

import com.springboot.comweb.entity.Company;
import com.springboot.comweb.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CompanyController {

    public CompanyService companyService;

    public CompanyController(CompanyService theCompanyService) {
        companyService = theCompanyService;
    }

    @GetMapping("/company")
    public String showCompany(Model theModel){

        List<Company> theCompanies = companyService.findAll();
        theModel.addAttribute("companyList", theCompanies);
        theModel.addAttribute("company", new Company());
        return "company-list";
    }

    @PostMapping("/save")
    public String saveCompanyName(@ModelAttribute(name = "theCompany")Company theCompany){
        companyService.save(theCompany);
        return "redirect:/company";
    }
}
