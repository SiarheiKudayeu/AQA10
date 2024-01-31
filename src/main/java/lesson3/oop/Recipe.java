package lesson3.oop;

import java.util.Arrays;

public class Recipe {

    public Recipe(String title, int price, String[] listOfIngredients) {
        System.out.println("I am constructor from line 8");
        this.title = title;
        this.price = price;
        this.listOfIngredients = listOfIngredients;
    }

    public Recipe(String title, int price, boolean isVegan, double timeToCook, String[] listOfIngredients) {
        this.title = title;
        this.price = price;
        this.isVegan = isVegan;
        this.timeToCook = timeToCook;
        this.listOfIngredients = listOfIngredients;
    }

    public Recipe(String title, int price, boolean isVegan, String[] listOfIngredients) {
        this(title, price, listOfIngredients);
        this.isVegan = isVegan;
        this.timeToCook = 0.3;
    }



    public Recipe(){}

    public String title;
    public int price;
    public boolean isVegan;
    public double timeToCook;

    public String[] listOfIngredients;

    public void getInfo() {
        System.out.println("Title of dish is: " + title);
        System.out.println("Price: " + price);
        System.out.println("List of Ingredients: " + Arrays.toString(listOfIngredients));
    }
}
