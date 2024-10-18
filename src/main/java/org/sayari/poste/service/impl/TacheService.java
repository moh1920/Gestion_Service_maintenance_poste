package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Region;
import org.sayari.poste.entity.Tache;
import org.sayari.poste.reposetry.TacheRepo;
import org.sayari.poste.service.inter.ITache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheService implements ITache {
    @Autowired
    private TacheRepo tacheRepo;
    @Override
    public Tache createTache(Tache tache) {
        return tacheRepo.save(tache);
    }

    @Override
    public Tache updateTache(Tache tache) {
        return tacheRepo.save(tache);
    }

    @Override
    public void deleteTache(Integer id) {
        tacheRepo.deleteById(id);
    }

    @Override
    public Tache getTache(Integer id) {
        return tacheRepo.findById(id).orElse(null);
    }

    @Override
    public List<Tache> getAllTachesByRegion() {
        return tacheRepo.findAll();
    }
}
