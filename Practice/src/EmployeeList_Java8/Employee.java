package EmployeeList_Java8;

import java.util.*;

public class Employee {

    private int emp_Id;

    private String emp_Name;

    private int emp_age;

    private String gender;

    private String domin;

    private String city;

    private int rank;

    private List<String> contacts;


    public Employee(int emp_Id, String emp_Name, int emp_age, String gender, String domin, String city, int rank, List<String> contacts) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_age = emp_age;
        this.gender = gender;
        this.domin = domin;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDomin() {
        return domin;
    }

    public void setDomin(String domin) {
        this.domin = domin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmp_Id() == employee.getEmp_Id() && getEmp_age() == employee.getEmp_age() && getRank() == employee.getRank() && Objects.equals(getEmp_Name(), employee.getEmp_Name()) && Objects.equals(getGender(), employee.getGender()) && Objects.equals(getDomin(), employee.getDomin()) && Objects.equals(getCity(), employee.getCity()) && Objects.equals(getContacts(), employee.getContacts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmp_Id(), getEmp_Name(), getEmp_age(), getGender(), getDomin(), getCity(), getRank(), getContacts());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_Id=" + emp_Id +
                ", emp_Name='" + emp_Name + '\'' +
                ", emp_age=" + emp_age +
                ", gender='" + gender + '\'' +
                ", domin='" + domin + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
