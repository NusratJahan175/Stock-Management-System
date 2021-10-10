package com.springboot.comweb.service;

import com.springboot.comweb.entity.StockIn;
import com.springboot.comweb.repository.StockInRepository;
import org.springframework.stereotype.Service;

@Service
public class StockInServiceImplementation implements StockInService {

    public StockInRepository stockInRepository;

    public StockInServiceImplementation(StockInRepository theStockInRepository) {
        stockInRepository = theStockInRepository;
    }

    @Override
    public void save(StockIn theStockIn) {
        stockInRepository.save(theStockIn);
    }
}
