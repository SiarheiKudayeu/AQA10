package lesson5.generics.ex2;

import lesson3.bearex.Bear;

public class MainPrinterBoth {
    public static void main(String[] args) {
        PrinterWithTwoArguments<String, Integer> printer1 = new PrinterWithTwoArguments<>("Text", 3333);
        printer1.printBoth();
        System.out.println("===========");
        PrinterWithTwoArguments<Bear, String> printer2 = new PrinterWithTwoArguments<>(new Bear("Mihail", true), "Hello Generic");
        printer2.printBoth();
    }
}
