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
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "category")
    private String categoryName;

    @Column(name = "company")
    private String companyName;

    @Column(name = "item",length = 50)
    private String itemName;

    @Column(name = "reorder")
    private int reorderLevel = 0;

}
