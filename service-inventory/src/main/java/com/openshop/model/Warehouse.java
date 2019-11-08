package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import com.openshop.util.Address;
import com.openshop.util.Organization;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory_warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(targetEntity = Organization.class)
    @JoinColumn(name = "enterprise_id")
    Long idEnterprise;

    @OneToOne(cascade = CascadeType.ALL,targetEntity = Address.class)
    @JoinColumn(name = "address_id")
    Long idAddress;
}
