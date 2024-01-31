package lesson3.static_word.fields_methods;

public class Main {
    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
        exampleStatic.nonStaticMethod();
        System.out.println(exampleStatic.nonStaticString);
        System.out.println("============");
        ExampleStatic.staticMethod();
        System.out.println(ExampleStatic.staticString);
        exampleStatic.staticMethod();
    }
}
