package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Utilisateur;
import org.sayari.poste.reposetry.UtilisateurRepo;
import org.sayari.poste.service.inter.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService implements IUtilisateurService {


    @Autowired
    private UtilisateurRepo utilisateurRepository;
    @Override
    public List<Utilisateur> findAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur findUtilisateurById(Integer id) {
            return utilisateurRepository.findById(id).orElse(null);
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Integer id) {
        utilisateurRepository.deleteById(id);
        System.out.println("Utilisateur deleted");
    }
}
