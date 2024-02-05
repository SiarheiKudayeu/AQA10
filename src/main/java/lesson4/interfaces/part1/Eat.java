package lesson4.interfaces.part1;

public interface Eat {

    void eat();

    void drink();

    default void jump(){
        System.out.println("I believe I can jump.");
    }
}
