package com.example.springUsingH2Database.h2Database.controller;

import com.example.springUsingH2Database.h2Database.empRepository.empRepo;
import com.example.springUsingH2Database.h2Database.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
    @Autowired
   private empRepo repo;
  @PostMapping("/saveEmp")
    public String saveEpm(@RequestBody Employee employee)
    {
       repo.save(employee);
       return "Employee Saved";
    }
    @PostMapping("/saveAllEmp")
    public List<Employee> saveAllEmployees(@RequestBody List<Employee> employees)
    {
       return repo.saveAll(employees);
    }
  @GetMapping("/getAllEmp")
    public List<Employee> getAllEmp()
    {
        return repo.findAll();
    }
@GetMapping("/getEmployeeByDept/{dept}")
    public List<Employee> getEmployeeByDept(@PathVariable String dept)
    {
       return repo.findByDept(dept);
    }
    @GetMapping("/GetById/{id}")
    public Optional<Employee> getEmpById(@PathVariable int id)
    {
        return repo.findById(id);
    }
    @PutMapping("/updateEmp")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
Employee existingEmp=repo.findById(employee.getEmpId()).orElse(null);
existingEmp.setEmpName(employee.getEmpName());
existingEmp.setEmpCity(employee.getEmpCity());
existingEmp.setdept(employee.getdept());
existingEmp.setEmpSalary(employee.getEmpSalary());
return repo.save(existingEmp);
    }
    @DeleteMapping("/deleteEmpById/{id}")
    public String deleteEmp(@PathVariable int id)
    {
        repo.deleteById(id);
        return "Employee Deleted";
    }
}
