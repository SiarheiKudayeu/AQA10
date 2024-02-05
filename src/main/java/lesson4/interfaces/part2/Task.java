package lesson4.interfaces.part2;

public class Task {
    /*Создать интерфейс Sportable в котором назаначить только один метод doSport().
    Создать класс CrossFitMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю кроссфит. Мое имя {name}.".
    Создать класс BodybuildingMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю качалку. Мое имя {name}." .
    Создать класс CalisthenicsMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю турник. Мое имя {name}.".
    Создать массив типа Sportable. Разместить в него спорстменов разного вида. Пройтись циклом по всему массиву и
    вызвать у каждого спортсмена метод doSport().

    P.s. В классах поля сделать приватными. Не забыть про конструкторы, геттеры и сеттеры. А также методы toString,
    hashCode() и equals().*/
    public static void main(String[] args) {
        Sportable man1 = new BodybuildingMan("Alex");
        Sportable man2 = new CalisthenicsMan("Max");
        Sportable man3 = new CrossFitMan("Ben");

        Sportable[] arrayOfMan = {man1, man2, man3};

        for (Sportable man: arrayOfMan){
            man.doSport();
        }
    }
}
