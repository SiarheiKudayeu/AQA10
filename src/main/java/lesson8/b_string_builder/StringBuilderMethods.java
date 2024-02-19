package lesson8.b_string_builder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("text");
        System.out.println(text);

        //append()
        text.append(5).append(" ").append("text");
        System.out.println(text);

        //insert
        System.out.println(text.insert(5, " INSERT!!! "));

        //reverse
        System.out.println(text.reverse());

        //delete
        System.out.println(text.delete(6, 13));

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("text");
        System.out.println(stringBuffer);

    }
}
