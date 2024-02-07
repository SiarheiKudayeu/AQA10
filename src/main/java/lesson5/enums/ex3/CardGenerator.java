package lesson5.enums.ex3;

import java.util.Random;

import static lesson5.enums.ex3.CardGenerator.Card.getRandomCardType;
import static lesson5.enums.ex3.CardGenerator.Card.getRandomCardValue;

public class CardGenerator {
    //Написать программу генератор случайной карты, которая будет иметь
    // статический метод  printRandomCard() вывода в консоль случайно сгенерированной карты.
    //Создать два отдельных  Enum CardsTypes, CardValues.
    //CardsTypes может быть четырех видов ♦, ♠, ♣, ♥.
    // CardValues : SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    //Создать класс Card, который в параметры конструктора будет принимать аргументы типа CardsTypes, CardValues
public enum CardsTypes{
    HEART("♥"), DIAMOND("♦"), CLUB("♣"), SPADE("♠");
    private String value;

        public String getValue() {
            return value;
        }

        CardsTypes(String value) {
            this.value = value;
        }
    }
    public enum CardValues{
        SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("JACK"), QUEEN("QUEEN"), KING("KING"), ACE("ACE");
        private String value;

        public String getValue() {
            return value;
        }

        CardValues(String value) {
            this.value = value;
        }
    }

    public static class Card{
    public CardsTypes cardsTypes;
    public CardValues cardValues;

        public Card(CardsTypes cardsTypes, CardValues cardValues) {
            this.cardsTypes = cardsTypes;
            this.cardValues = cardValues;
        }
        @Override
        public String toString(){
            return   cardValues.value + cardsTypes.value;
        }

        public static CardValues getRandomCardValue() {
            CardValues[] values = CardValues.values();
            return values[new Random().nextInt(values.length)];
        }

        public static CardsTypes getRandomCardType() {
            CardsTypes[] types = CardsTypes.values();
            return types[new Random().nextInt(types.length)];
        }


    }
    public static void printRandomCard(){
        System.out.println(new Card(getRandomCardType(),getRandomCardValue()));
    }
}
