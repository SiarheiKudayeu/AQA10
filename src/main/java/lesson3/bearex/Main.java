package lesson3.bearex;

public class Main {
    public static void main(String[] args) {
        Bear bear1 = new Bear("Miha", true);
        bear1.getInfo();
        bear1.setAge(19);
        bear1.getInfo();
        Bear bear2 = new Bear("Angelina", false);
        Bear bear3 = new Bear("Miha2", true);
        Bear miniBear1 = bear1.makeBabyBear(bear2, "Max", true);
        Bear miniBear2 = bear1.makeBabyBear(bear3, "Alona", false);

        miniBear1.getInfo();
        System.out.println("=====");
        miniBear2.getInfo();
        System.out.println("=====");
        System.out.println(miniBear1);
    }
}
