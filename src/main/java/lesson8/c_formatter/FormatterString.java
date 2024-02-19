package lesson8.c_formatter;

public class FormatterString {
    public static void main(String[] args) {

        //String %s
        String change = "XXXX";
        System.out.printf("This is %s string for format\n", change);
        System.out.printf("This is %s string %s for format\n", change, "text!!!!");
        System.out.printf("This is %2$s string %1$s for format\n", change, "text!!!!");

        //%c - char
        //%d - byte,short, int, long
        //%f - float, double

        //%b - boolean
        System.out.printf("Boolean formatter %b\n", null);
        System.out.printf("Boolean formatter %b\n", 33);
        System.out.printf("Boolean formatter %b\n", "33");

    }

}
