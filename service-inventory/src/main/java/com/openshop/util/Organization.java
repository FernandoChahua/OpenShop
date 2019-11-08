package com.openshop.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "party_organization")
public class Organization {
  @Id
  @GeneratedValue
  Long id;
}