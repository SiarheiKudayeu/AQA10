package lesson5.generics.ex3;

import lesson3.bearex.Bear;

public class CreatorApp {
    public static void main(String[] args) {
        GenericHuman<Human> human = new GenericHuman<>(new Human("Matt"));
        human.sayInfoAboutThisInstance();

        GenericHuman<HorseMan> horseMan = new GenericHuman<>(new HorseMan("Ad"));
        horseMan.sayInfoAboutThisInstance();
    }
}
