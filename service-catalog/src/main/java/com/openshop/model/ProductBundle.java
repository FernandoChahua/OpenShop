package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalog_product_bundle")
public class ProductBundle {

    @EmbeddedId
    ProductBundlePK pK;

    @ManyToOne()
    @MapsId("itemId")
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne()
    @MapsId("componentId")
    @JoinColumn(name = "component_id")
    Product component;

    Integer quantity;

    @Data
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    private class ProductBundlePK implements Serializable {
        Long itemId;
        Long componentId;
    }
}