package lesson5.generics.ex3;

public class HorseMan extends Humanable{
    public HorseMan(String name) {
        super(name);
        this.type = Type.HORSEMAN;
    }

    @Override
    public String toString() {
        return "HorseMan{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
