package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Planning;

public interface IPlanningService {

    Planning createPlanning(Planning planning);
    Planning updatePlanning(Planning planning);
    void deletePlanning(Integer idplanning);
    Planning getPlanningById(Integer idplanning);
    Iterable<Planning> getAllPlannings();



}
