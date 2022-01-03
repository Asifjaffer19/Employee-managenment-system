package com.Aasifjaffer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aasifjaffer.Entity.Employee;
@Repository

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
