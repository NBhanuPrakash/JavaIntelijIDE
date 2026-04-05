package org.nnjavatechie.common.strems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Rahul", "Mech", 250000.0),
                new Employee("Dheeraj", "Mech", 350000.0),
                new Employee("Mahesh", "CSE", 450000.0),
                new Employee("Sai", "CSE", 350000.0),
                new Employee("Lakshmi", "ECE", 4500000.0));

        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(collect);
    }
}
class Employee{
    private String empName;
    private String department;
    private Double salary;

    public Employee(String empName, String department, Double salary) {
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}