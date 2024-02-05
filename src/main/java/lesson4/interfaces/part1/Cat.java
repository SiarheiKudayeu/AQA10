package lesson4.interfaces.part1;

public class Cat implements Eat, Feel{
    @Override
    public void eat() {
        System.out.println("I eat like a tiger");
    }

    @Override
    public void drink() {

    }

    @Override
    public void feel() {
        System.out.println(" I have a felling!");
    }
}
