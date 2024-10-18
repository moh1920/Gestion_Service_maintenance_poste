package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Probleme;
import org.sayari.poste.reposetry.PreblemeRepo;
import org.sayari.poste.service.inter.IProbleme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemeService implements IProbleme {
    @Autowired
    private PreblemeRepo preblemeRepo ;


    @Override
    public List<Probleme> findAllProblemes() {
        return preblemeRepo.findAll();
    }

    @Override
    public Probleme updateProbleme(Probleme probleme) {
         return preblemeRepo.save(probleme);

    }

    @Override
    public void deleteProbleme(Integer idProbleme) {
        if (preblemeRepo.existsById(idProbleme)) {
            preblemeRepo.deleteById(idProbleme);
            System.out.println("Problème supprimé avec succès");
        } else {
            System.out.println("Problème non trouvé avec l'ID : " + idProbleme);
        }
    }

    @Override
    public Probleme findById(Integer id) {
        return preblemeRepo.findById(id).orElse(null);
    }

    @Override
    public void changerStatus(String nouveauStatus,Integer id) {
        Probleme probleme = findById(id);
        if(probleme != null){
            probleme.setStatus(nouveauStatus);
            preblemeRepo.save(probleme);
        }else {
            throw new RuntimeException("Cannot find changer");
        }

    }
}
