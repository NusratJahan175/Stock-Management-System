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
public class HomeController {



    @GetMapping("/home")
    public String ShowHomePage(){
        return "home.html";
    }


    /*@PostMapping("/save")
    public String showFormForAdd(Model theModel){

        Company theCompany = new Company();
        theModel.addAttribute("company",theCompany);
        return "redirect:/stockManagementSystem/company";
    }*/

}
