package com.example.gestion_rh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion_rh.model.Employee;



@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}