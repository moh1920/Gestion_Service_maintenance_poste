package org.sayari.poste.reposetry;

import org.sayari.poste.entity.GestionnaireDesuccursale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionnaireRepo extends JpaRepository<GestionnaireDesuccursale,Integer> {
}
