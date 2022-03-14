package com.br.xbrainproject.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleReport {
    @NotNull
    private String salesmanName;
    @NotNull
    private Integer totalSales;
    @NotNull
    private Double averageDailySales;
    //construtor
    public SaleReport(long totalSales, String salesmanName, Double averageDailySales) {
        this.totalSales = (int) totalSales;
        this.salesmanName = salesmanName;
        this.averageDailySales = averageDailySales;
    }
}
