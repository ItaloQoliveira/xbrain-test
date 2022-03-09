package com.br.xbrainproject.service;

import com.br.xbrainproject.dto.SalesmanRequest;
import com.br.xbrainproject.dto.SalesmanResponse;
import com.br.xbrainproject.model.Salesman;
import com.br.xbrainproject.repository.SalesmanRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesmanService {
    @Autowired
    private SalesmanRepository salesmanRepository;

    public SalesmanResponse saveSalesman(SalesmanRequest salesmanRequest) {
        var salesman = new Salesman();
        BeanUtils.copyProperties(salesmanRequest, salesman);
        return SalesmanResponse.convertFromSalesman(salesmanRepository.save(salesman));
    }
}
