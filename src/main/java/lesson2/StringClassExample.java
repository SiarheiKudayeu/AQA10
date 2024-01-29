package lesson2;

public class StringClassExample {
    public static void main(String[] args) {
        int x = 8;
        String text = new String("Hello world!!!");
        Integer xInteger = 7;
        //xInteger.
        String text2 = "Hello world!!";
        System.out.println(text2);
        String text3 = text2 + " Hello again!!";
        System.out.println(text3 + 5);
        System.out.println(text3);
        //==
        boolean result = text2.equals(text3);
        // System.out.println(text2==text3); так не нужно
        System.out.println(result);
    }
}
