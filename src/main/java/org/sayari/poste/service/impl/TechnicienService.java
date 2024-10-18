package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Planning;
import org.sayari.poste.entity.Probleme;
import org.sayari.poste.entity.TechnicienRegional;
import org.sayari.poste.reposetry.TechnicienRepo;
import org.sayari.poste.service.inter.ITechnicienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicienService implements ITechnicienService {
    @Autowired
    private TechnicienRepo technicienRepo ;
    @Override
    public TechnicienRegional createTechnicienRegional(TechnicienRegional technicienRegional) {
        return  technicienRepo.save(technicienRegional);
    }

    @Override
    public TechnicienRegional updateTechnicienRegional(TechnicienRegional technicienRegional) {
        return  technicienRepo.save(technicienRegional);
    }

    @Override
    public void deleteTechnicienRegional(Integer id) {
        technicienRepo.deleteById(id);
        System.out.println("technicien deleted");
    }

    @Override
    public TechnicienRegional findById(Integer id) {
        return technicienRepo.findById(id).orElse(null);
    }

    @Override
    public List<TechnicienRegional> findAllTach() {
        return technicienRepo.findAll();
    }

    @Override
    public void assignerPlanning(Planning planning) {

    }

    @Override
    public void traitementDeProbleme(Probleme probleme) {

    }
}
