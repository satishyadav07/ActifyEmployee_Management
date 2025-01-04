package com.example.ActifyEmployeeManagement.controller;

import com.example.ActifyEmployeeManagement.model.EmployeeModel;
import com.example.ActifyEmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

//
//    @PostMapping("/employee")
//    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel){
//        return employeeService.saveEmployee(employeeModel);
//    }
//
//    @GetMapping("/employee/{id}")
//    public Optional<EmployeeModel> getEmployeeByID(@PathVariable("id") Long id){
//        return employeeService.getEmployeeById(id);
//    }

    @PostMapping("/employee")
    public ResponseEntity<String> addEmployee(@RequestBody Map<String, Object> payload) {
        String name = (String) payload.get("name");
        String email = (String) payload.get("email");
        Integer departmentId = (Integer) payload.get("departmentId");
        Integer roleId = (Integer) payload.get("roleId");

        employeeService.addEmployee(name, email, departmentId, roleId);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee Added");
    }

    // GET /employees/{id}
    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable("id") Integer id) {
        EmployeeModel employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }


}
