package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.openshop.util.Organization;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalog_price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(targetEntity = Organization.class)
    @JoinColumn(name = "enterprise_id")
    Long idEnterprise;

    @ManyToOne
    @JoinColumn(name = "item_id")
    Item item;

    @Enumerated(EnumType.STRING)
    PriceType priceType;

    LocalDate fromDate;
    LocalDate toDate;

    BigDecimal amount;

    Integer percent;

    String details;
}
