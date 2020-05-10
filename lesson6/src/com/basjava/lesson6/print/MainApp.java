package com.basjava.lesson6.print;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Выберите устройство для печати:");

        LazerPrinter lazerPrint = new LazerPrinter("Canon i-SENSYS");
        Monitor monitor = new Monitor("Samsung S24E391HL");
        Display display = new Display("Sharp PN70TB3");

        Printer[] array =  {lazerPrint, monitor, display};

        for (int i = 0; i <array.length ; i++) {
            System.out.println(i + 1 + " " +  array[i].getName());
        }

        Printable operation = ScannerUtil.getPrinter();
        ScannerUtil.printPhrase(operation);
        System.out.println("Напечатать новое сообщение?\n1 - На текщем устройстве\n2 - На новом устройстве");
        boolean reprintWithSelectedPrinter = ScannerUtil.reprintWithSelectedPrinter();
        if(reprintWithSelectedPrinter){
            ScannerUtil.printPhrase(operation);
        } else {
            System.out.println("Выберите устройство для печати:");
            operation = ScannerUtil.getPrinter();
            ScannerUtil.printPhrase(operation);
        }
    }
}
