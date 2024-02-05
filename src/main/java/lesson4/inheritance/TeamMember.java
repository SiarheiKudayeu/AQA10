package lesson4.inheritance;

public class TeamMember {
    public String name;
    public int age;
    public String profession;

    //public TeamMember(){}

    public int y = 22;

    public TeamMember(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession;
    }

    public void doWork(){
        System.out.println("I do my work (TeamMember)");
    }
}
