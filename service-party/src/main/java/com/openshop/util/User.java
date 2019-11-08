package com.openshop.util;

import javax.persistence.*;


@Entity
@Table(name = "user_user")
public class User {
    @Id
    @GeneratedValue
    Long id;
}
