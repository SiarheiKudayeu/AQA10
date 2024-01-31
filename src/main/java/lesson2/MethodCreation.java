package lesson2;

import java.util.Random;

public class MethodCreation {
    //Ничего не принимает и ничего не возвращает
    public static void soutSmthingInConsole(){
        System.out.println("Hello World");
    }
    //принимает аргументы и ничего не возвращает
    public static void soutSmthingInConsoleWithArguments(String text){
        System.out.println(text);
    }
    //Ничего не принимает и возвращает значение
    public static int returnRandomInt(){
        Random random = new Random();
        int randomInt = random.nextInt(0, 101);
        return randomInt;
    }

    //принимает в аргументы и возвращает значение
    public static int returnSumOfNumbers(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {
        soutSmthingInConsole();
        soutSmthingInConsoleWithArguments("Какой-то текст 2");
        int myRandomInt = returnRandomInt();
        System.out.println(myRandomInt);
        int sumOfNumbers = returnSumOfNumbers(23, 44);
        System.out.println("Sum of two numbers " + sumOfNumbers);
    }
}
