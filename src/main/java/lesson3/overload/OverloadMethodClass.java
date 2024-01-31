package lesson3.overload;

public class OverloadMethodClass {
    public static void main(String[] args) {
        OverloadMethodClass overloadMethodClass = new OverloadMethodClass();
        overloadMethodClass.doSmth();
        overloadMethodClass.doSmth("Txet");

        new OverloadMethodClass().doSmth("Word", 3);

        System.out.println(overloadMethodClass.doSmth("Key", 3, 5));
    }

    public void doSmth() {
        System.out.println("I am empty");
    }

    public void doSmth(String text) {
        System.out.println("I have text:" + text);
    }

    public void doSmth(String text, int number) {
        System.out.println("I have text:" + text + ". I have number: " + number);
    }

    public int doSmth(String text, int number, int number2) {
        System.out.println("I have text:" + text + ". I have number: " + number);
        return number + number2;
    }
}
