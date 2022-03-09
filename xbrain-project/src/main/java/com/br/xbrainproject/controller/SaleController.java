package com.br.xbrainproject.controller;

import com.br.xbrainproject.dto.SaleRequest;
import com.br.xbrainproject.dto.SaleResponse;
import com.br.xbrainproject.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping
    public SaleResponse save(@RequestBody SaleRequest saleRequest) {
        return saleService.saveSale(saleRequest);
    }
}
