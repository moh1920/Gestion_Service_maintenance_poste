package org.sayari.poste.reposetry;

import org.sayari.poste.entity.AdministrateurRegional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrateurRepo extends JpaRepository<AdministrateurRegional,Integer> {
}
