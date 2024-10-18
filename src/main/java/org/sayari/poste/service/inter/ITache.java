package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Region;
import org.sayari.poste.entity.Tache;

import java.util.List;

public interface ITache {

    Tache createTache(Tache tache);
    Tache updateTache(Tache tache);
    void deleteTache(Integer id);
    Tache getTache(Integer id);
    List<Tache> getAllTachesByRegion();


}
