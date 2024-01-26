package lesson1;

public class BooleanClass {
    public static void main(String[] args) {
        boolean myBoolean = false;
        boolean myBoolean2 = true;

        System.out.println(myBoolean2);

        // ==
        int x = 10;
        int y = 13;
        boolean result = x == y;
        System.out.println(result);

        // !=
        System.out.println(10 != 13);

        //> < >= <=
        System.out.println(10 > 10);
        System.out.println(10 >= 10);

        System.out.println("=============");
        // || or
        System.out.println(12 > 3 || 10 == 2 || 11 != 2);

        // && and
        System.out.println(12 > 3 && 10 == 2 && 11 != 2);
    }
}
