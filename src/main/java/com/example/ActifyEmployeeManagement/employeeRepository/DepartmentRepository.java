package com.example.ActifyEmployeeManagement.employeeRepository;

import com.example.ActifyEmployeeManagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
