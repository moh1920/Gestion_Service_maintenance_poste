package org.sayari.poste.service.inter;

import org.sayari.poste.entity.EmployeDeSuccursale;
import org.sayari.poste.entity.Probleme;

import java.net.http.WebSocket;
import java.util.List;

public interface IEmployeeService {

    EmployeDeSuccursale createEmployeDeSuccursale(EmployeDeSuccursale employeDeSuccursale);
    EmployeDeSuccursale updateEmployeDeSuccursale(EmployeDeSuccursale employeDeSuccursale);
    void deleteEmployeDeSuccursale(Integer id);
    EmployeDeSuccursale findEmployeDeSuccursaleById(Integer id);
    List<EmployeDeSuccursale> findAllEmployeDeSuccursale();

}
