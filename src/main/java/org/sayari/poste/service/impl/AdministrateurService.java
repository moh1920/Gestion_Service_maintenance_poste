package org.sayari.poste.service.impl;

import org.sayari.poste.entity.AdministrateurRegional;
import org.sayari.poste.entity.Planning;
import org.sayari.poste.entity.Rapport;
import org.sayari.poste.reposetry.AdministrateurRepo;
import org.sayari.poste.service.inter.IAdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministrateurService implements IAdministrateurService {
    @Autowired
    private AdministrateurRepo administrateurRepo;
    @Autowired
    private PlannigService plannigService;
    @Autowired
    private RapportService rapportService;
    @Override
    public AdministrateurRegional createAdmis(AdministrateurRegional administrateurRegional) {
        AdministrateurRegional regional = new AdministrateurRegional();
        regional.setFirstName(administrateurRegional.getFirstName());
        regional.setLastName(administrateurRegional.getLastName());
        regional.setEmail(administrateurRegional.getEmail());
        return administrateurRepo.save(regional);

    }

    @Override
    public AdministrateurRegional updateAdmis(AdministrateurRegional administrateurRegional) {
        return administrateurRepo.save(administrateurRegional);
    }

    @Override
    public void deleteAdmis(Integer id) {
administrateurRepo.deleteById(id);
    }

    @Override
    public Planning planificationDePlanning(Planning planning) {
        return plannigService.createPlanning(planning);
    }

    @Override
    public Rapport genereRapport(Rapport rapport) {
        return rapportService.createRapport(rapport);
    }
}
