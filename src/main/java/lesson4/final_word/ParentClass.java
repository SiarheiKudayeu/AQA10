package lesson4.final_word;

public class ParentClass {
    public String text = "text";
    public final String CONSTANT = "CONSTANT";

    public void forOverload() {
        System.out.println("I am parent");
    }

    public final void doSmth(){
        System.out.println("I am final method");
    }
}
