package org.sayari.poste.controller;

import org.sayari.poste.entity.EmployeDeSuccursale;
import org.sayari.poste.entity.Probleme;
import org.sayari.poste.service.impl.EmployeeService;
import org.sayari.poste.service.impl.GestionnaireService;
import org.sayari.poste.service.impl.ProblemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Gestionnaire")
public class GestionnaireDesuccursale {
    @Autowired
    private EmployeeService employeeService ;
    @Autowired
    private ProblemeService problemeService ;
    @PostMapping("/createEmployee")
    public EmployeDeSuccursale addEmployee(@RequestBody EmployeDeSuccursale employeDeSuccursale){
        return employeeService.createEmployeDeSuccursale(employeDeSuccursale);
    }
    @GetMapping("/getAllEmployee")
    public List<EmployeDeSuccursale> findAllEmployee(){
        return employeeService.findAllEmployeDeSuccursale();
    }
    @DeleteMapping("/deleteEmploy")
    public void deleteEmployeDeSuccursale(Integer id) {
        employeeService.deleteEmployeDeSuccursale(id);
        System.out.println("employee deleted");
    }
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










}
