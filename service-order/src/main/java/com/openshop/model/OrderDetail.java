package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import com.openshop.util.Item;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_order_detail")
public  class OrderDetail {

//    @EmbeddedId
//    OrderDetailPK pK;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    protected Order order;

    @ManyToOne(targetEntity=Item.class)
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    Long  idItem;

    protected Integer quantity;

    protected BigDecimal unitPrice;

    protected LocalDate programmedDate;

    @Enumerated(EnumType.STRING)
    protected OrderStatus status;

    protected String shippingInstructions;

    @OneToMany(mappedBy = "orderDetail")
    protected List<ShippedItem> shippedItems;


//    @Data
//    @Embeddable
//    @NoArgsConstructor
//    @AllArgsConstructor
//    protected class OrderDetailPK implements Serializable {
//        Long orderId;
//        Long itemId;
//    }
}
