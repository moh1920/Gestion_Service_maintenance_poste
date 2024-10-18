package org.sayari.poste.service.impl;

import org.sayari.poste.entity.EmployeDeSuccursale;
import org.sayari.poste.reposetry.EmployeeRepo;
import org.sayari.poste.service.inter.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public EmployeDeSuccursale createEmployeDeSuccursale(EmployeDeSuccursale employeDeSuccursale) {
        return employeeRepo.save(employeDeSuccursale);
    }

    @Override
    public EmployeDeSuccursale updateEmployeDeSuccursale(EmployeDeSuccursale employeDeSuccursale) {
        return employeeRepo.save(employeDeSuccursale);
    }

    @Override
    public void deleteEmployeDeSuccursale(Integer id) {
        employeeRepo.deleteById(id);
        System.out.println("employee deleted");
    }

    @Override
    public EmployeDeSuccursale findEmployeDeSuccursaleById(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public List<EmployeDeSuccursale> findAllEmployeDeSuccursale() {
        return employeeRepo.findAll();
    }
}
