package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalog_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @ManyToMany
    @JoinTable(
            name = "catalog_category_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    List<Category> categories;

    @OneToMany(mappedBy = "product", orphanRemoval = true)
    List<RequiredAttribute> attributes;

    @OneToMany(mappedBy = "product", orphanRemoval = true)
    List<Item> items;

    @ManyToOne
    @JoinColumn(name = "measurement_unit_id")
    MeasureUnit measuredIn;

    Double amount;

    @ManyToMany
    @JoinTable(
            name = "catalog_product_media",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "media_id"))
    List<Multimedia> multimedia;

    Boolean integral;
}
