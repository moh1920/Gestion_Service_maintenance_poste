package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Planning;
import org.sayari.poste.entity.Probleme;
import org.sayari.poste.entity.TechnicienRegional;

import java.util.List;

public interface ITechnicienService {
    TechnicienRegional createTechnicienRegional(TechnicienRegional technicienRegional);
    TechnicienRegional updateTechnicienRegional(TechnicienRegional technicienRegional);
    void deleteTechnicienRegional(Integer id);
    TechnicienRegional findById(Integer id);
    List<TechnicienRegional> findAllTach();
    void assignerPlanning(Planning planning);
    void traitementDeProbleme(Probleme probleme);
}
