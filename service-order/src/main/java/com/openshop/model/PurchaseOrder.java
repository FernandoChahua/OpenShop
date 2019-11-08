package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.openshop.util.Organization;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_purchase_order")
public class PurchaseOrder extends Order {

    @ManyToOne(targetEntity=Organization.class)
    @JoinColumn(name = "supplier_id")
    Long idSupplier;
}
