package com.example.sanket.mvcproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sanket.mvcproject.entity.Employee;

//PreferenceString --> abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {

}
