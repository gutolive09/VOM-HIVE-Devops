package br.com.VomHive.VomHive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUCT")
    @SequenceGenerator(name = "SQ_PRODUCT", sequenceName = "SQ_PRODUCT", allocationSize = 1)

    @Column(name = "ID_PRODUCT")
    private Long idProduct;

    @Column(name = "TARGET")
    private String target;

    @Column(name = "NM_PRODUCT")
    private String nmProduct;

    @Column(name = "DIFFERENTIAL")
    private String differential;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "SALES_CHANNEL")
    private String salesChannel;
}
