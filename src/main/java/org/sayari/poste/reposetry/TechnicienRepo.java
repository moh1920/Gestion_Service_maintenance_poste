package org.sayari.poste.reposetry;

import org.sayari.poste.entity.TechnicienRegional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepo extends JpaRepository<TechnicienRegional,Integer> {
}
