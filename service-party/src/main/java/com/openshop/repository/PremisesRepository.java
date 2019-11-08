package com.openshop.repository;
import org.springframework.stereotype.Repository;
import com.openshop.model.Premises;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PremisesRepository extends JpaRepository<Premises,Long> {

}
