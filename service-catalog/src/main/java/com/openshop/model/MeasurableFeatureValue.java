package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalog_measurable_feature_value")
public class MeasurableFeatureValue extends FeatureValue {
    Double value;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    MeasureUnit measuredIn;
}
