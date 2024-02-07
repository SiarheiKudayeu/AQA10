package lesson5.generics.ex3;

public abstract class Humanable {
    protected String name;
    protected Type type;

    public Humanable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
    protected abstract void sayWhoAmI();
}
