package lesson4.interfaces.part2;

public class BodybuildingMan implements Sportable{
    private String name;

    public BodybuildingMan(String name) {
        this.name = name;
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю качалку. Мое имя "+name+".");
    }
}
