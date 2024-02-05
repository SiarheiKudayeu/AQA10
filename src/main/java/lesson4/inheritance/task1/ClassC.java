package lesson4.inheritance.task1;

public class ClassC extends ClassB{
    public ClassC(){
        System.out.println("Constructor ClassC");
    }
    static {
        System.out.println("Static block C");
    }
}
