package com.br.xbrainproject.controller;

import com.br.xbrainproject.dto.SaleReportRequest;
import com.br.xbrainproject.dto.SaleReportResponse;
import com.br.xbrainproject.dto.SaleRequest;
import com.br.xbrainproject.dto.SaleResponse;
import com.br.xbrainproject.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping
    public SaleResponse save(@RequestBody SaleRequest saleRequest) {
        return saleService.saveSale(saleRequest);
    }

    @GetMapping("/report")
    public SaleReportResponse getReports(@RequestBody SaleReportRequest saleReportRequest){
        return saleService.getReport(saleReportRequest);
    }
}
