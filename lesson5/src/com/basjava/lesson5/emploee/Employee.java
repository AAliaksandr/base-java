package com.basjava.lesson5.emploee;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private int age;
    private LocalDate dateOfReceipt;
    private String position;
    private int salary;
    private int hoursWorked;

    public Employee(String name, int age, LocalDate dateOfReceipt, String position, int salary, int hoursWorked) {
        this.name = name;
        this.age = age;
        this.dateOfReceipt = dateOfReceipt;
        this.position = position;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public int getSalaryCalculation(){
        return salary * hoursWorked / 22;
    }
    public void print(){
        System.out.println("zp = " + getSalaryCalculation());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(LocalDate dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
