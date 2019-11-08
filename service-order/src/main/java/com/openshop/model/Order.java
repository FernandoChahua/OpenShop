package com.openshop.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.openshop.util.Address;
import com.openshop.util.Organization;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_order")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(targetEntity=Organization.class)
    @JoinColumn(name = "enterprise_id")
    Long idEnterprise;

    LocalDate orderDate;

    @OneToOne(targetEntity=Address.class)
    @JoinColumn(name = "delivery_address_id")
    Long idDeliveryAddress;
}
