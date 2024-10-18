package org.sayari.poste.controller;

import org.sayari.poste.entity.*;
import org.sayari.poste.entity.GestionnaireDesuccursale;
import org.sayari.poste.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admis")
public class AdministrateurController {
    @Autowired
    private GestionnaireService gestionnaireService ;
    @Autowired
    private AdministrateurService administrateurService ;
    @Autowired
    private PlannigService plannigService ;
    @Autowired
    private RapportService rapportService ;
    @Autowired
    private RegionService regionService ;
    @Autowired
    private TechnicienService technicienService ;

    @PostMapping("/add")
    public AdministrateurRegional creatAdmis(@RequestBody AdministrateurRegional administrateurRegional){
        return administrateurService.createAdmis(administrateurRegional);
    }
    @PostMapping("/addplanning")
    public Planning planificationDePlanning(@RequestBody Planning planning){
        return administrateurService.planificationDePlanning(planning);
    }
    @PostMapping("/addRapport")
    public Rapport genereRapport(@RequestBody Rapport rapport){
        return administrateurService.genereRapport(rapport);
    }
    @DeleteMapping("/deleteRapport")
    public void deleteRapport(@RequestParam Integer id){
        rapportService.deleteRapport(id);
    }
    @GetMapping("/getPlanning")
    public Planning getPlanningById(@RequestParam Integer id){
        return plannigService.getPlanningById(id);
    }
    @DeleteMapping("/deletePlanning")
    public void deletePlanning(@RequestParam Integer idplanning){
        plannigService.deletePlanning(idplanning);
    }
    @GetMapping("/getAllPlannings")
    public Iterable<Planning> getAllPlannings(){
        return plannigService.getAllPlannings();
    }
    @PostMapping("/createRegion")
    public Region createRegion(@RequestBody Region region){
        return regionService.createRegion(region);
    }
    @DeleteMapping("/deleteRegion")
    public void deleteRegion(@RequestParam Integer idRegion){
        regionService.deleteRegion(idRegion);
        System.out.println("Region deleted");
    }
    @GetMapping("/getRegion")
    public List<Region> getAllRegions(){
        return regionService.getAllRegions();
    }
    @PostMapping("/creategestionnaire")
    public GestionnaireDesuccursale createGestionnaireDesuccursale(@RequestBody GestionnaireDesuccursale gestionnaireDesuccursale) {
        return gestionnaireService.createGestionnaireDesuccursale(gestionnaireDesuccursale);
    }
    @GetMapping("/getGestionnaireDesuccursale")
    public List<GestionnaireDesuccursale> findAllGest() {
        return gestionnaireService.findAllGest();
    }
    @DeleteMapping("/deleteGestionnaireDesuccursale")
    public void deleteGestionnaireDesuuccursale(Integer id) {
        gestionnaireService.deleteGestionnaireDesuuccursale(id);
        System.out.println("gestionnaire deleted");
    }
    @PostMapping("/createTechnicien")
    public TechnicienRegional createTechnicienRegional(@RequestBody  TechnicienRegional technicienRegional) {
        return  technicienService.createTechnicienRegional(technicienRegional);
    }











}
