package lesson4.inner_class;

public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym("Kanban", "Functional");
        Gym.Equipment equipment = gym.new Equipment("Bar", 2000);
        equipment.tryInner2();
        System.out.println(gym.getEquipmentCost(equipment));
    }
}
