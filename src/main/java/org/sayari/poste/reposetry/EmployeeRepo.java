package org.sayari.poste.reposetry;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.sayari.poste.entity.EmployeDeSuccursale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeDeSuccursale,Integer> {
}
