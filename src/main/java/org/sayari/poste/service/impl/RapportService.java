package org.sayari.poste.service.impl;

import org.sayari.poste.entity.AdministrateurRegional;
import org.sayari.poste.entity.Rapport;
import org.sayari.poste.reposetry.AdministrateurRepo;
import org.sayari.poste.reposetry.RapportRepo;
import org.sayari.poste.reposetry.RegionRepo;
import org.sayari.poste.reposetry.TechnicienRepo;
import org.sayari.poste.service.inter.IRapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.Region;

@Service
public class RapportService implements IRapport {
    @Autowired
    private RapportRepo rapportRepo;
    @Autowired
    private AdministrateurRepo administrateurRepo;
    @Autowired
    private RegionRepo regionRepo;
    @Override
    public Rapport createRapport(Rapport rapport) {
        Integer idregion = rapport.getIdregion();
        if (!regionRepo.findById(idregion).isPresent()) {
            throw new RuntimeException("Région non trouvée");
        }

        AdministrateurRegional administrateurRegional = rapport.getAdministrateurRegional();
        boolean adminFound = false;

        for (AdministrateurRegional admin : administrateurRepo.findAll()) {
            if (admin.equals(administrateurRegional)) {
                rapport.setAdministrateurRegional(admin);
                adminFound = true;
                break;
            }
        }

        if (!adminFound) {
            throw new RuntimeException("Administrateur non trouvé");
        }

        return rapportRepo.save(rapport);
    }

    @Override
    public Rapport updateRapport(Rapport rapport) {
        return rapportRepo.save(rapport);
    }

    @Override
    public void deleteRapport(Integer id) {
        if (!rapportRepo.findById(id).isPresent()) {
            throw new RuntimeException("Rapport non trouvé");
        }
        rapportRepo.deleteById(id);
        System.out.println("rapport deleted");
    }

}
