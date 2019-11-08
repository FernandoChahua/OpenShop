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
@Table(name = "catalog_item_configuration")
public class ItemConfiguration
{
    @EmbeddedId
    ItemConfigurationPK pK;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    Item item;

    @ManyToOne
    @JoinColumn(name = "featureId")
    FeatureValue featureValue;

    @Data
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    private class ItemConfigurationPK implements Serializable {
        Long itemId;
        Long attributeId;
    }
}
