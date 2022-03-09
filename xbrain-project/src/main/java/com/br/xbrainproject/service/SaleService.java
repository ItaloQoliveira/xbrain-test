package com.br.xbrainproject.service;

import com.br.xbrainproject.dto.SaleRequest;
import com.br.xbrainproject.dto.SaleResponse;
import com.br.xbrainproject.exception.CustomException;
import com.br.xbrainproject.model.Sale;
import com.br.xbrainproject.model.Salesman;
import com.br.xbrainproject.repository.SaleRepository;
import com.br.xbrainproject.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SalesmanRepository salesmanRepository;

    public SaleResponse saveSale(SaleRequest saleRequest) {
        salesmanRepository.findById(saleRequest.getSalesmanId())
                .orElseThrow(() -> new CustomException("Salesman not found, check salesmanID and try again"));
        var sale = new Sale();
        sale.setDate(LocalDateTime.now());
        sale.setValue(saleRequest.getValue());
        sale.setSalesman(Salesman.builder()
                .id(saleRequest.getSalesmanId())
                .build());
        return SaleResponse.convertFromSale(saleRepository.save(sale));
    }
}
