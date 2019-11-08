package com.openshop.model;
import com.openshop.util.User;

import javax.persistence.*;

@MappedSuperclass
public abstract class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Boolean registered;

    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    Long idUser;
}
