package org.sayari.poste.service.inter;

import org.sayari.poste.entity.Probleme;

import java.util.List;

public interface IProbleme {
    List<Probleme>  findAllProblemes();
    Probleme updateProbleme(Probleme probleme);
    void deleteProbleme(Integer idprobleme);
    Probleme findById(Integer id);
    void changerStatus(String nouveauStatus ,Integer id);
}
