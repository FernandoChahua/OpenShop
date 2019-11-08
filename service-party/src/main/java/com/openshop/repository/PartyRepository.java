package com.openshop.repository;

import org.springframework.stereotype.Repository;
import com.openshop.model.Party;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PartyRepository extends JpaRepository<Party,Long> {

}

