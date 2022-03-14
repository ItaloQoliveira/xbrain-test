package com.br.xbrainproject.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SaleReportRequest {
    @NotNull
    LocalDateTime dateStart;
    @NotNull
    LocalDateTime dateEnd;
}
