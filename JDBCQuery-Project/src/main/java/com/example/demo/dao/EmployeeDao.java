package com.example.demo.dao;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
	   List<Employee> findAll();
	   int addEmployee(Employee employee);
	   Optional<Employee> findById(int id);
	   int deleteEmployee(int id);
	   int updateEmployee(int id, Employee employee);
}
