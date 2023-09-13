package com.training.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.model.*;

public interface EmployeeDao {
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
}