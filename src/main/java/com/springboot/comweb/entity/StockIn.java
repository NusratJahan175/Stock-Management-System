package com.springboot.comweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "stock_in")
public class StockIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "company")
    private String companyName;

    @Column(name = "item")
    private String itemName;

    @Column(name = "reorder")
    private int reorderLevel;

    @Column(name = "available_quantity")
    private int availableQuantity;

    @Column(name = "stock_in_quantity")
    private int stockInQuantity;

}
