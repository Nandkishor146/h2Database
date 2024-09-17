package com.example.springUsingH2Database.h2Database.entity;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;
    private String empCity;
    private String dept;
    private double empSalary;

    public Employee() {
    }

    public Employee(int empId, String empName, String empCity, String dept, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.dept = dept;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getdept() {
        return dept;
    }

    public void setdept(String dept) {
        this.dept = dept;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", dept='" + dept + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
