package com.openshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalog_category_navigation")
public class CategoryNavigation {
    @EmbeddedId
    CategoryNavigationPK pk;

    @ManyToOne
    @MapsId("parentId")
    @JoinColumn(name = "parent_id")
    Category parent;

    @ManyToOne
    @MapsId("childId")
    @JoinColumn(name = "child_id")
    Category child;

    @Data
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    private class CategoryNavigationPK implements Serializable {
        Long parentId;
        Long childId;
    }
}
