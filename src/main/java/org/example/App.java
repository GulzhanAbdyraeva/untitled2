package org.example;

import org.example.service.EmpService;
import org.example.service.EmpServiceImpl;

public class App {
    public static void main( String[] args ) {
        EmpService empService = new EmpServiceImpl();
        empService.createEmployeeTable();

    }
}
