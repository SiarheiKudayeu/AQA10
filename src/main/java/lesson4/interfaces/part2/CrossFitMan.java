package lesson4.interfaces.part2;

public class CrossFitMan implements Sportable {
    private String name;

    public CrossFitMan(String name) {
        this.name = name;
    }

    public void doSmth(){}

    @Override
    public void doSport() {
        System.out.println("Я люблю кроссфит. Мое имя " + name + ".");
    }
}
