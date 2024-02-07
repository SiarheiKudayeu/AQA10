package lesson5.enums.ex2;

public class PersonHuman {
    private String name;
    public int money;

    public String getName() {
        return name;
    }

    public PersonHuman(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void whichGroupCanVisit() {
        if (money < Group.METALLICA.getCostOfTicket()) {
            System.out.println("Stay at home, and have fun!!!");
        } else if (money < Group.ACDC.getCostOfTicket() && money > Group.METALLICA.getCostOfTicket()) {
            System.out.println(getName() + ", you can go to " + Group.METALLICA.getName() + ".");
        } else if (money < Group.QUEEN.getCostOfTicket() && money > Group.ACDC.getCostOfTicket()) {
            System.out.println(getName() + ", you can go to " + Group.ACDC.getName() + ".");
        } else {
            System.out.println("Go whenever you wish!!!");
        }
    }
}
