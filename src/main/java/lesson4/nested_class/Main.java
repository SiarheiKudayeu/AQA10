package lesson4.nested_class;

public class Main {
    public static void main(String[] args) {
        OwnerClass.NestedClass.nestedStaticMethod();
        System.out.println(OwnerClass.NestedClass.nestedString);
        String url1 = OwnerClass.URL.url1;
    }
}
