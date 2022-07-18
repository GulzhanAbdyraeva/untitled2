package org.example.service;

import org.example.model.Employee;

import java.util.List;

public interface EmpService {

    void createEmployeeTable();
    String addEmployee(Employee employee);
    void dropTAble();
    void cleanTable();
    void alterTable();
    Employee updateEmp(Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> sortTable();

}
