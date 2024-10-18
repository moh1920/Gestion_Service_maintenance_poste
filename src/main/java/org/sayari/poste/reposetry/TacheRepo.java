package org.sayari.poste.reposetry;

import org.sayari.poste.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepo extends JpaRepository<Tache,Integer> {
}
