package lesson8.h_serialize;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Person(int age, String name) {
        System.out.println("Constructor from Person!!");
        this.age = age;
        this.name = name;
    }

    private Animal animal;
}
