package com.springboot.comweb.service;

import com.springboot.comweb.entity.Company;

import java.util.List;

public interface CompanyService {

    public List<Company> findAll();
    public Company findById(int companyId);
    public void save(Company theCompany);
    public void deleteById(int companyId);

}
