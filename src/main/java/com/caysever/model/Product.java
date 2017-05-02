package com.caysever.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by alican on 01.05.2017.
 */
@Entity
@Table(name = "PRODUCT")
@Data
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String details;
    private BigDecimal price;
    @Column(name = "count")
    private Long stockCount;

    public Product() {
    }

    public Product(Long id, String name, String details, BigDecimal price, Long stockCount) {
        this.id=id;
        this.name = name;
        this.details = details;
        this.price = price;
        this.stockCount = stockCount;
    }
}
