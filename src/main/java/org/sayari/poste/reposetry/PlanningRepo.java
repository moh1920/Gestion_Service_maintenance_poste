package org.sayari.poste.reposetry;

import org.sayari.poste.entity.Planning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanningRepo extends JpaRepository<Planning,Integer> {
}
