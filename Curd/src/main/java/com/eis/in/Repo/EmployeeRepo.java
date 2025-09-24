package com.eis.in.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eis.in.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
