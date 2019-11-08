package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_role")
public class Role {
    @Id
    @GeneratedValue
    Long id;

    String description;

    @Enumerated(EnumType.ORDINAL)
    AccountType accountType;
}
