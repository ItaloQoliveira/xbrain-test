package com.br.xbrainproject.dto;

import com.br.xbrainproject.model.Salesman;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SalesmanResponse {
    private Integer id;
    private String name;


    public static SalesmanResponse convertFromSalesman(Salesman salesman) {
        return SalesmanResponse.builder()
                .id(salesman.getId())
                .name(salesman.getName())
                .build();
    }
}
