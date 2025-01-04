package com.example.ActifyEmployeeManagement.employeeRepository;

import com.example.ActifyEmployeeManagement.model.EmpRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<EmpRole, Integer> {
}