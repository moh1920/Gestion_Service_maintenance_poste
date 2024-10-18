package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Rapport;

public interface IRapport {
    Rapport createRapport(Rapport rapport);
    Rapport updateRapport(Rapport rapport);
    void deleteRapport(Integer id);
}
