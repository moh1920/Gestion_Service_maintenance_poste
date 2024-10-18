package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    List<Utilisateur> findAllUtilisateur ();
    Utilisateur findUtilisateurById(Integer id);
    Utilisateur createUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateur(Integer id);


}
