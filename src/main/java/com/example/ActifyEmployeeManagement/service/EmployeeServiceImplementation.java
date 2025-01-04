package com.example.ActifyEmployeeManagement.service;

import com.example.ActifyEmployeeManagement.employeeRepository.DepartmentRepository;
import com.example.ActifyEmployeeManagement.employeeRepository.EmployeeRepository;
import com.example.ActifyEmployeeManagement.employeeRepository.RoleRepository;
import com.example.ActifyEmployeeManagement.model.Department;
import com.example.ActifyEmployeeManagement.model.EmpRole;
import com.example.ActifyEmployeeManagement.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public EmployeeModel saveEmployee(EmployeeModel employeeModel) {

        // Ensure Department exists
        Department department = departmentRepository.findById(employeeModel.getDepartment().getId())
                .orElseGet(() -> departmentRepository.save(employeeModel.getDepartment()));

        // Ensure Role exists
        EmpRole role = roleRepository.findById(employeeModel.getEmpRole().getId())
                .orElseGet(() -> roleRepository.save(employeeModel.getEmpRole()));

        // Set fetched Department and Role to the EmployeeModel
        employeeModel.setDepartment(department);
        employeeModel.setEmpRole(role);
        return employeeRepository.save(employeeModel);
    }

    @Override
    public Optional<EmployeeModel> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }




}
