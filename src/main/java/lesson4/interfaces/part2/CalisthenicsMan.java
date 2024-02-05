package lesson4.interfaces.part2;

public class CalisthenicsMan implements Sportable{
    private String name;

    public CalisthenicsMan(String name) {
        this.name = name;
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю турник. Мое имя "+name+".");
    }
}
