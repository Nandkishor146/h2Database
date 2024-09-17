package com.example.springUsingH2Database.h2Database.empRepository;

import com.example.springUsingH2Database.h2Database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface empRepo extends JpaRepository<Employee ,Integer> {
    List<Employee> findByDept(String dept);
}
