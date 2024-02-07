package lesson5.generics.ex2;

public class PrinterWithTwoArguments <T1, T2>{
    private T1 firstType;
    private T2 secondType;

    public PrinterWithTwoArguments(T1 firstType, T2 secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public void printFirstType(){
        System.out.println("Type of first Var " + firstType.getClass().getName());
    }

    public void printSecondType(){
        System.out.println("Type of second Var " + secondType.getClass().getName());
    }

    public void printBoth(){
        printFirstType();
        printSecondType();
    }
}
