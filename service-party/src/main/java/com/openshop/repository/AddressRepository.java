package com.openshop.repository;

import org.springframework.stereotype.Repository;
import com.openshop.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
