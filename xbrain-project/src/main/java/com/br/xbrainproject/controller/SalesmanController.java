package com.br.xbrainproject.controller;

import com.br.xbrainproject.dto.SalesmanRequest;
import com.br.xbrainproject.dto.SalesmanResponse;
import com.br.xbrainproject.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {
    @Autowired
    private SalesmanService salesmanService;

    @PostMapping
    public SalesmanResponse save(@RequestBody SalesmanRequest salesmanRequest) {
        return salesmanService.saveSalesman(salesmanRequest);
    }
}
