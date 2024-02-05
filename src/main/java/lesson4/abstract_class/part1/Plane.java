package lesson4.abstract_class.part1;

public class Plane extends Vehicles{
    @Override
    void move() {
        System.out.println(" I can fly");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", cost=" + cost;
    }

    public Plane(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
}
