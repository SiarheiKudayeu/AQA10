package lesson3.oop;

public class Main {
    public static void main(String[] args) {
        Recipe saltedWater = new Recipe();
        saltedWater.getInfo();
        System.out.println(saltedWater.timeToCook);
        saltedWater.title = "Water with salt";
        saltedWater.price = 10;
        saltedWater.listOfIngredients = new String[]{"Salt", "Water"};
        saltedWater.getInfo();

        Recipe saltedWater2 = saltedWater;
        saltedWater2.price = 12;

        System.out.println("==============");
        saltedWater.getInfo();
        System.out.println("==============");
        saltedWater2.getInfo();
    }
}
