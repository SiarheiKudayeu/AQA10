package lesson3.oop;

public class MainForConstructor {
    public static void main(String[] args) {
        Recipe saltAndWater = new Recipe("Salted water", 1000, new String[]{"Water", "Salt"});
        saltAndWater.getInfo();
    }
}
