package com.springboot.comweb.service;

import com.springboot.comweb.repository.CompanyRepository;
import com.springboot.comweb.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImplementation implements CompanyService {

    public CompanyRepository companyRepository;

    public CompanyServiceImplementation(CompanyRepository theCompanyRepository) {
        companyRepository = theCompanyRepository;
    }


    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findById(int theId) {
        return null;
    }

    @Override
    public void save(Company theCompany) {

        companyRepository.save(theCompany);
    }

    @Override
    public void deleteById(int theId) {

    }
}
