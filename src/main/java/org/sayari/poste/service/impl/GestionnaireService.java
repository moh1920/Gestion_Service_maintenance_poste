package org.sayari.poste.service.impl;

import org.sayari.poste.entity.GestionnaireDesuccursale;
import org.sayari.poste.reposetry.GestionnaireRepo;
import org.sayari.poste.service.inter.IGestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionnaireService implements IGestionnaireService {
    @Autowired
    private GestionnaireRepo gestionnaireRepository;
    @Override
    public GestionnaireDesuccursale createGestionnaireDesuccursale(GestionnaireDesuccursale gestionnaireDesuccursale) {
        return gestionnaireRepository.save(gestionnaireDesuccursale);
    }

    @Override
    public GestionnaireDesuccursale updateGestionnaireDesuccursale(GestionnaireDesuccursale gestionnaireDesuccursale) {
        return gestionnaireRepository.save(gestionnaireDesuccursale);
    }

    @Override
    public void deleteGestionnaireDesuuccursale(Integer id) {
         gestionnaireRepository.deleteById(id);
        System.out.println("gestionnaire deleted");
    }

    @Override
    public List<GestionnaireDesuccursale> findAllGest() {
        return gestionnaireRepository.findAll();
    }
}
