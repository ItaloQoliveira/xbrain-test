package com.br.xbrainproject.repository;

import com.br.xbrainproject.model.Sale;
import com.br.xbrainproject.model.SaleReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {
    @Query(value =
            "SELECT new com.br.xbrainproject.model.SaleReport(" +
                    "(SELECT count(sale.id) from Sale sale WHERE sale.salesman.id = salesman.id AND sale.date BETWEEN :dateStart AND :dateEnd), salesman.name, avg(sale.value)) " +
                    "FROM Salesman salesman " +
                    "JOIN Sale sale ON sale.salesman.id = salesman.id " +
                    "WHERE sale.date BETWEEN :dateStart AND :dateEnd GROUP BY salesman.id")
    List<SaleReport> buildSaleReportsBySalesmanBetweenDates(
            @Param("dateStart") LocalDateTime dateStart,
            @Param("dateEnd") LocalDateTime dateEnd);
}
