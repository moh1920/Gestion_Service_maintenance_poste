package org.sayari.poste.controller;

import org.sayari.poste.entity.Planning;
import org.sayari.poste.entity.Probleme;
import org.sayari.poste.entity.TechnicienRegional;
import org.sayari.poste.service.impl.PlannigService;
import org.sayari.poste.service.impl.ProblemeService;
import org.sayari.poste.service.impl.TechnicienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technicien")
public class TechniceinController {
    @Autowired
    private TechnicienService technicienService ;
    @Autowired
    private ProblemeService problemeService ;
    @Autowired
    private PlannigService plannigService ;

    @GetMapping("/getAllProbleme")
    public List<Probleme> findAllProblemes() {
        return problemeService.findAllProblemes();
    }
    @GetMapping("/getProblemeById")
    public Probleme findById(Integer id) {
        return problemeService.findById(id);
    }
    @PostMapping("/updateProbleme")
    public Probleme updateProbleme(@RequestBody Probleme probleme) {
        return problemeService.updateProbleme(probleme);
    }
    @DeleteMapping("/deleteProbleme")
    public void deleteProbleme(@RequestParam Integer idprobleme) {
        problemeService.deleteProbleme(idprobleme);
        System.out.println("probleme deleteed");
    }
    @PostMapping("/changerStatus")
    public void changerStatus(@RequestParam String nouveauStatus, @RequestParam Integer id) {
        problemeService.changerStatus(nouveauStatus, id);
    }
    @GetMapping("/getPlanning")
    public Planning getPlanningById(@RequestParam Integer id){
        return plannigService.getPlanningById(id);
    }
    @GetMapping("/getAllPlannings")
    public Iterable<Planning> getAllPlannings(){
        return plannigService.getAllPlannings();
    }

}
