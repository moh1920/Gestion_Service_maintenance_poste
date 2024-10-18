package org.sayari.poste.controller;

import org.sayari.poste.entity.Utilisateur;
import org.sayari.poste.service.impl.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService ;
    @PostMapping("/add")
    public Utilisateur addUtilisateur(Utilisateur utilisateur){
        return utilisateurService.createUtilisateur(utilisateur);
    }
}
