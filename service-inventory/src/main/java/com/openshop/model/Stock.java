package com.openshop.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.openshop.util.Item;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory_stock")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @ManyToOne(targetEntity = Item.class)
    @JoinColumn(name = "item_id")
    protected Long idItem;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    protected Warehouse warehouse;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    protected Batch batch;

    String additionalDetails;
}