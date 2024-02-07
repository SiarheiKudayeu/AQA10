package lesson5.generics.ex1;

public class BoxApp {
    public static void main(String[] args) {
        SimpleBox intSimpleBox1 = new SimpleBox(25);
        SimpleBox intSimpleBox2 = new SimpleBox(45);
        intSimpleBox2.setObject("Text");
        int result = 0;
        if(intSimpleBox2.getObject() instanceof Integer && intSimpleBox1.getObject() instanceof Integer) {
           result  = (Integer) intSimpleBox1.getObject() + (Integer) intSimpleBox2.getObject();
        } else {
            System.out.println("Type of data is different");
        }
        System.out.println(result);

        GenericBox<Integer> intGenericBox1 = new GenericBox<>(30);
        GenericBox<Integer> intGenericBox2 = new GenericBox<>(24);
        GenericBox<String> stringGenericBox = new GenericBox<>("Text");

        intGenericBox1.setObject(66);

        int result2 = intGenericBox2.getObject() + intGenericBox1.getObject();
        System.out.println(result2);
        String result3 = intGenericBox2.getObject() + stringGenericBox.getObject();
        System.out.println(result3);


    }
}
