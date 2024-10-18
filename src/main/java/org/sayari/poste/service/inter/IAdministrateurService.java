package org.sayari.poste.service.inter;

import org.sayari.poste.entity.*;

import java.util.List;

public interface IAdministrateurService {
    AdministrateurRegional createAdmis(AdministrateurRegional administrateurRegional);
    AdministrateurRegional updateAdmis(AdministrateurRegional administrateurRegional);
    void deleteAdmis(Integer id);
    Planning planificationDePlanning (Planning planning);
    Rapport genereRapport(Rapport rapport);




}
