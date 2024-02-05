package lesson4.inheritance;

public class MainForTeamMember {
    public static void main(String[] args) {
        TeamMember teamMember = new TeamMember("Ivan", 33, "teamMember");
        teamMember.doWork();

        Developer developer = new Developer("Alona", 26);
        developer.doWork();
        developer.printYValueFromParentAndChild();

        System.out.println("===============");

        TeamMember teamMember1 = new Developer("Sam", 20);
        teamMember1.doWork();
        ((Developer) teamMember1).develop();

        System.out.println("===============");
        System.out.println(teamMember);
        System.out.println(developer);
        System.out.println(teamMember1);
    }
}
