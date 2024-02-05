package lesson4.inheritance;

public class Developer extends TeamMember {
    public Developer(String name, int age){
        super(name, age, "Developer");
    }
    public int y = 33;

    public void develop() {
        System.out.println("I develop!!!");
    }
    public void printYValueFromParentAndChild(){
        System.out.println("Y from parent = " + super.y);
        System.out.println("Y from child = " + this.y);
    }

    public void doWorkWithSuper() {
        super.doWork();
        System.out.println("I do my work (Developer)");
    }

    @Override
    public void doWork() {
        System.out.println("I do my work (Developer)");
    }
}
