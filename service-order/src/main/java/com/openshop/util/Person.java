package com.openshop.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "party_person")
public class Person {
  @Id
  @GeneratedValue
  Long id;
}