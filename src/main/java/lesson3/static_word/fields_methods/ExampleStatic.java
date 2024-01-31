package lesson3.static_word.fields_methods;

public class ExampleStatic {
    public static String staticString = "staticString";
    public String nonStaticString = "nonStaticString";

    public static void staticMethod(){
        System.out.println("Static method!");
    }

    public  void nonStaticMethod(){
        System.out.println("NonStatic method!");
    }

    public void printNonStatic(){
        nonStaticMethod();
        System.out.println(nonStaticString);
        staticMethod();
        System.out.println(staticString);
    }
    public static void printStatic(){
        /*nonStaticMethod();
        System.out.println(nonStaticString);*/
        staticMethod();
        System.out.println(staticString);
    }

}
