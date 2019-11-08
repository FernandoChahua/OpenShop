package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory_batch")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /*@ManyToMany
    @JoinTable(name = "inventory_batch_order_detail",
            joinColumns = @JoinColumn(name = "batch_id"),
            inverseJoinColumns = @JoinColumn(name = "order_detail_id")
                    /*{@JoinColumn(name = "order_id"), @JoinColumn(name = "item_id")})
    List<OrderDetail> orderDetail;*/

    LocalDate productionDate;

    LocalDate expirationDate;

    Integer quantity;

    Double unitCost;
}
