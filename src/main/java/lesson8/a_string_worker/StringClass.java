package lesson8.a_string_worker;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {

        //concat()
        String text = "SOme random teext";
        text = text + " additional text";
        System.out.println(text);
        System.out.println(text = text.concat(" concat").concat(" ").concat("3"));
        System.out.println(text);
        System.out.println(5 + " this is five");

        //equals
        System.out.println("==================");
        System.out.println("text".equals("texta"));
        System.out.println("==================");
        //символы экранирования \n, \b
        System.out.println("My random word \"WORD!!!\"\nWith the new lines\b");


        System.out.println("nana");
        System.out.print("nana");
        System.out.println("nana");

        System.out.println("==================");
        //length()
        System.out.println("My random word \"WORD!!!\"With the new lines".length());

        //valueOf()
        boolean boo = false;
        String cooleanString = String.valueOf(boo);

        //contains()
        System.out.println("My random word \"WORD!!!\"With the new lines".contains("WORDx"));

        //charAt
        String forCharAt = "\"My random word \"WORD!!!\"With the new lines\"";
        System.out.println(forCharAt.charAt(2));

        System.out.println("================");
        //indexOf(), lastIndexOf()
        System.out.println(forCharAt.indexOf("r"));
        System.out.println(forCharAt.lastIndexOf("r"));

        //substring()
        System.out.println(forCharAt.substring(4));
        System.out.println(forCharAt.substring(4, 13));
        System.out.println(forCharAt.substring(0, 13));

        //replace
        System.out.println(forCharAt.replace("WORD!!!", "WORLD@@@"));
        System.out.println(forCharAt.replace("WORD!!!", ""));

        //endsWith(), startsWith()
        System.out.println(forCharAt.startsWith("\"My random word "));
        System.out.println(forCharAt.endsWith("XXXXXXX"));

        //toLowerCase(), toUpperCase()
        System.out.println("nadvbiuvbkOIUBKJBIb,bbihPIYGPYGPP".toLowerCase());
        System.out.println("nadvbiuvbkOIUBKJBIb,bbihPIYGPYGPP".toUpperCase());

        //split()
        String forSplit = "My random word WORD! With the new lines";
        String[] afterFirstSplit = forSplit.split("a");
        System.out.println(Arrays.toString(afterFirstSplit));
        System.out.println(afterFirstSplit[0]);
        System.out.println(afterFirstSplit[1]);
        System.out.println("The count or words in text is: " + forSplit.split("\\s").length);







    }
}
