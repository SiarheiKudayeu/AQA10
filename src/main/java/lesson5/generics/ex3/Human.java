package lesson5.generics.ex3;

public class Human extends Humanable{
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Human(String name) {
        super(name);
        this.type = Type.HUMAN;
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
