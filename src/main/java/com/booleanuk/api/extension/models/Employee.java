package com.booleanuk.api.extension.models;

public class Employee {
    private int id;
    private String name;
    private String job;
    private String salaryGrade;
    private String department;

    public Employee() {}

    public Employee(int id, String name, String job, String salaryGrade, String department) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salaryGrade = salaryGrade;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(String salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}