package lesson5.generics.ex3;

public class Hobbit extends Humanable{
    public Hobbit(String name) {
        super(name);
        this.type = Type.HOBBIT;
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
