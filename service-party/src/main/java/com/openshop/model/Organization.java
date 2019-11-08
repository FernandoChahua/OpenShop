package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "party_organization")
public class Organization extends Party {
    String name;
    String ruc;
    String webPage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_address_id")
    Address mainAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Organization org = (Organization) o;
        return Objects.equals(ruc, org.ruc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruc);
    }
}
