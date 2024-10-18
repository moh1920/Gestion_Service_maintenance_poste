package org.sayari.poste.service.inter;

import org.sayari.poste.entity.GestionnaireDesuccursale;
import org.sayari.poste.entity.Probleme;

import java.util.List;

public interface IGestionnaireService {
    GestionnaireDesuccursale createGestionnaireDesuccursale(GestionnaireDesuccursale gestionnaireDesuccursale);
    GestionnaireDesuccursale updateGestionnaireDesuccursale(GestionnaireDesuccursale gestionnaireDesuccursale);
    void deleteGestionnaireDesuuccursale(Integer id);
    List<GestionnaireDesuccursale> findAllGest();

}
