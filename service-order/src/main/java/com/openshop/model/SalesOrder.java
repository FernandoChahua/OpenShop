package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.openshop.util.Person;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_sales_order")
public class SalesOrder extends Order {

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "customer_id")
    Long idCustomer;

}
