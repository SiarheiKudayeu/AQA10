package lesson4.inheritance;

public class Qa extends TeamMember{

    private int countOfFoundedBugs;

    public Qa(String name, int age, String profession, int countOfFoundedBugs) {
        super(name, age, profession);
        this.countOfFoundedBugs = countOfFoundedBugs;
    }
}
