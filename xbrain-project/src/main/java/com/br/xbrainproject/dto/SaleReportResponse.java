package com.br.xbrainproject.dto;

import com.br.xbrainproject.model.Sale;
import com.br.xbrainproject.model.SaleReport;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class SaleReportResponse {
    private List<SaleReport> reportList;

    public static SaleReportResponse convertFromReportList(List<SaleReport> reportList) {
        return SaleReportResponse.builder()
                .reportList(reportList)
                .build();
    }
}
