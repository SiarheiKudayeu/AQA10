package lesson4.abstract_class.part1;

public abstract class Vehicles {
    public String name;
    public int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    abstract void move();
}
