package com.br.xbrainproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sale")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "value")
    private Double value;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "salesmanId")
    private Salesman salesman;


}
