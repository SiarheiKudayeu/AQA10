package lesson4.inheritance.task1;

public class ClassB extends ClassA {
    public ClassB(){
        System.out.println("Constructor ClassB");
    }

    static {
        System.out.println("Static block B");
    }
}
