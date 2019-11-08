package com.openshop.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "catalog_item")
public class Item {
  @Id
  @GeneratedValue
  Long id;
}