package lesson5.generics.ex1;

public class SimpleBox {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public SimpleBox(Object object) {
        this.object = object;
    }
}
