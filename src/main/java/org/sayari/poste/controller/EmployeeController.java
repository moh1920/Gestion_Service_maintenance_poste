package org.sayari.poste.controller;

import org.sayari.poste.entity.EmployeDeSuccursale;
import org.sayari.poste.entity.Probleme;
import org.sayari.poste.service.impl.EmployeeService;
import org.sayari.poste.service.impl.ProblemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
@Autowired
    private ProblemeService problemeService ;
    @PostMapping("/createProbmee")
    public Probleme createEmployee(@RequestBody Probleme probleme) {
        return problemeService.updateProbleme(probleme);
    }
    @DeleteMapping("/deleteProbleme")
    public void deleteProbleme(@RequestParam Integer idprobleme) {
        problemeService.deleteProbleme(idprobleme);
        System.out.println("probleme deleteed");
    }






}
