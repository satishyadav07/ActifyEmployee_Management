package com.example.ActifyEmployeeManagement.employeeRepository;

import com.example.ActifyEmployeeManagement.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel,Long> {
}
