package lesson1;

public class IncrementDecrement {
    public static void main(String[] args) {
        //постфиксный инкремент (++)
        int a = 3;
        // a = a + 1;
        System.out.println(a++); // a = a + 1;
        System.out.println(a);
        System.out.println("===============");
        //префиксный инкремент
        int b = 3;
        System.out.println(++b);
        System.out.println(b);
        System.out.println("===============");
        //постфиксный декремент (--)
        int c = 3;
        System.out.println(c--); // c = c -1
        System.out.println(c);
        System.out.println("===============");

        //префиксный декремент
        int d = 3;
        System.out.println(--d);
        System.out.println(d);

        System.out.println("===============");
        int e = 3;
        e += 4; // e = e + 4
        System.out.println(e);
    }
}
