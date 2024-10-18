package org.sayari.poste.service.impl;

import org.sayari.poste.entity.AdministrateurRegional;
import org.sayari.poste.entity.Planning;
import org.sayari.poste.reposetry.AdministrateurRepo;
import org.sayari.poste.reposetry.PlanningRepo;
import org.sayari.poste.service.inter.IPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlannigService implements IPlanningService {
    @Autowired
    private PlanningRepo planningRepo;
    @Autowired
    private AdministrateurRepo administrateurRepo ;


    @Override
    public Planning createPlanning(Planning planning) {
         if(planning.getAdministrateurRegional()!=null) {
             for (AdministrateurRegional administrateurRegional : administrateurRepo.findAll()) {
                 if (administrateurRegional == planning.getAdministrateurRegional()) {
                     planning.setAdministrateurRegional(administrateurRegional);
                 } else {
                     new RuntimeException("AdministrateurRegional not found");

                 }
             }
         }
         return planningRepo.save(planning);
    }

    @Override
    public Planning updatePlanning(Planning planning) {
        return planningRepo.save(planning);
    }

    @Override
    public void deletePlanning(Integer idplanning) {
        planningRepo.deleteById(idplanning);
        System.out.println("Planning deleted");
    }

    @Override
    public Planning getPlanningById(Integer idplanning) {
        return planningRepo.findById(idplanning).orElse(null);
    }

    @Override
    public Iterable<Planning> getAllPlannings() {
        return planningRepo.findAll();
    }
}
