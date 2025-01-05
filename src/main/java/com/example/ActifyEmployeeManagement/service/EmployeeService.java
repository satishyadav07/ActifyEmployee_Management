package com.example.ActifyEmployeeManagement.service;

import com.example.ActifyEmployeeManagement.model.EmployeeModel;

import java.util.Optional;

public interface EmployeeService {


//
//    EmployeeModel saveEmployee(EmployeeModel employeeModel);
//
//    Optional<EmployeeModel> getEmployeeById(long id);
//




        EmployeeModel addEmployee(String name, String email, Integer departmentId, Integer roleId);

        Optional<EmployeeModel> getEmployeeById(long id);





}
