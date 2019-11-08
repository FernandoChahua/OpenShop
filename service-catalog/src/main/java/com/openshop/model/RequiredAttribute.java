package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalog_required_attribute")
public class RequiredAttribute {

    @EmbeddedId
    RequiredAttributePK pK;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @MapsId("attributeId")
    @JoinColumn(name = "attributeId")
    FeatureAttribute attribute;

    @Enumerated(EnumType.ORDINAL)
    Applicability applicability;

    LocalDate fromDate;

    LocalDate toDate;

    @Data
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    private class RequiredAttributePK implements Serializable {
        Long productId;
        Long attributeId;
    }
}
