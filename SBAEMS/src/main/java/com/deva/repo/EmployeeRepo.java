package com.deva.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deva.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> 
{}
