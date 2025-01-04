package com.example.ActifyEmployeeManagement.controller;

import com.example.ActifyEmployeeManagement.model.EmployeeModel;
import com.example.ActifyEmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    private EmployeeService employeeService;



    @PostMapping("/employee")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.saveEmployee(employeeModel);
    }

    @GetMapping("/employee/{id}")
    public Optional<EmployeeModel> getEmployeeByID(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }




}
