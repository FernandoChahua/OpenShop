package com.openshop.repository;

import org.springframework.stereotype.Repository;
import com.openshop.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Long> {

}
