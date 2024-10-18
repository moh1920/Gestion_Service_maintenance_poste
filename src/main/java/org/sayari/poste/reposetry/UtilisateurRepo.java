package org.sayari.poste.reposetry;

import org.sayari.poste.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Integer> {
}
