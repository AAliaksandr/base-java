package com.basjava.lesson5.emploee;

import java.time.LocalDate;

public class EmploeeApp {
    public static void main(String[] args) {
        OfficeManagement dir = new OfficeManagement("A", 40, LocalDate.of(2000, 2, 2), "Dir");
        AccountingService buh = new AccountingService("B", 50, LocalDate.of(2000, 3, 3), "Buh");
        TechnicalService ing = new TechnicalService("C", 35, LocalDate.of(2010, 2, 2), "Ing");
        ProductionService rab = new ProductionService("D", 40, LocalDate.of(2005, 5, 3), "Rab");
    }
}
