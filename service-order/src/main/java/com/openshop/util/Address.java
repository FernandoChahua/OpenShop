package com.openshop.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "party_address")
public class Address {
  @Id
  @GeneratedValue
  Long id;
}
