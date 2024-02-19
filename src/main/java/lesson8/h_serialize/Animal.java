package lesson8.h_serialize;

import java.io.Serializable;

public class Animal implements Serializable {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
