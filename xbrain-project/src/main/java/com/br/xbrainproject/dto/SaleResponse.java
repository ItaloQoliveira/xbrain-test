package com.br.xbrainproject.dto;

import com.br.xbrainproject.model.Sale;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SaleResponse {
    private Integer id;
    private LocalDateTime date;
    private Double value;
    private Integer salesmanId;
    private String salesmanName;

    public static SaleResponse convertFromSale(Sale sale) {
        return SaleResponse.builder()
                .id(sale.getId())
                .value(sale.getValue())
                .date(sale.getDate())
                .salesmanId(sale.getSalesman().getId())
                .salesmanName(sale.getSalesman().getName())
                .build();
    }
}
