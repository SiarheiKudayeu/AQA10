package lesson5.generics.ex4;

import lesson3.bearex.Bear;
import lesson5.generics.ex3.*;

public class GenericMethodClass {
    public static void main(String[] args) {
        printWhatever(new Human("Sam"));
        printWhateverTwoArguments(new Human("Dan"), new Bear("Alex", true));
        printOnlyHumanable(new Hobbit("Alisa"));
        System.out.println("===============");
        printGenericInstanceWildCart(new GenericHuman<>(new Human("Sam")));
        printGenericInstanceWildCart(new GenericHuman<>(new Hobbit("Alan")));

    }
    public static <T> void printWhatever(T x){
        System.out.println(x);
    }
    public static <T, M> void printWhateverTwoArguments(T first, M second){
        System.out.println(first);
        System.out.println(second);
    }
    public static <T extends Humanable> void printOnlyHumanable(T humanable){
        System.out.println(humanable);
    }

    public static void printGenericInstanceWildCart(GenericHuman<?> human){
        System.out.println(human);
    }

    public static void printGenericInstanceHuman(GenericHuman<Human> human){
        System.out.println(human);
    }

    public static void printGenericInstanceElf(GenericHuman<Elf> human){
        System.out.println(human);
    }

}
