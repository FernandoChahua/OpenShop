package com.openshop.repository;

import org.springframework.stereotype.Repository;
import com.openshop.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
