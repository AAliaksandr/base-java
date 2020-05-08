package com.basjava.lesson5.emploee;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private int age;
    private LocalDate dateOfReceipt;
    private String position;

    public Employee(String name, int age, LocalDate dateOfReceipt, String position) {
        this.name = name;
        this.age = age;
        this.dateOfReceipt = dateOfReceipt;
        this.position = position;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfReceipt=" + dateOfReceipt +
                ", position='" + position + '\'' +
                '}';
    }
}
