package org.sayari.poste.reposetry;

import org.sayari.poste.entity.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepo extends JpaRepository<Rapport,Integer> {
}
