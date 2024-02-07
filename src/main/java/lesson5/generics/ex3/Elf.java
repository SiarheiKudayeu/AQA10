package lesson5.generics.ex3;

public class Elf extends Humanable{
    public Elf(String name) {
        super(name);
        this.type = Type.ELF;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
