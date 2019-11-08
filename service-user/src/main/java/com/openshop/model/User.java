package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_user")
public class User {
    @Id
    @GeneratedValue
    Long id;

    String username;
    String email;
    Boolean emailValidated;
    String passwordHash;
    String passwordSalt;
    String passwordHint;

    @Enumerated(EnumType.ORDINAL)
    AccountType type;

    @ManyToMany
    @JoinTable(name = "user_user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Role> roles;
}
