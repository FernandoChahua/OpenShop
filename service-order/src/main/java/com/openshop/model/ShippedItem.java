package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.openshop.util.Item;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_shipped_item")
public class ShippedItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    OrderDetail orderDetail;

    @ManyToOne(targetEntity = Item.class)
    @JoinColumn(name = "item_id")
    Long idItem;

    Integer quantityShipped;

    Integer quantityAccepted;

    Integer quantityRejected;

    LocalDate shippingDate;

    LocalDate deliveryDate;

    String shipmentDescription;
}
