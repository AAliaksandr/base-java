package com.basjava.lesson5.emploee;

import java.time.LocalDate;

public class OfficeManagement extends Employee {

    public OfficeManagement(String name, int age, LocalDate dateOfReceipt, String position, int salary, int hoursWorked) {
        super(name, age, dateOfReceipt, position, salary, hoursWorked);
    }

    @Override
    public int getSalaryCalculation() {
        return super.getSalaryCalculation();
    }

    @Override
    public void print() {
        super.print();
    }
}

