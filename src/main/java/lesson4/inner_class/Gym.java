package lesson4.inner_class;

import java.util.Date;

public class Gym {
    public String name;
    private String type;

    public Equipment[] equipment;

    public int getEquipmentCost(Equipment equipment){
        return equipment.getCost();
    }

    static Date date;



    public Gym(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public class Equipment{
        public String name;
        private int cost;

        public void tryInner2(){
            getEquipmentCost(new Gym("A","w").new Equipment("S", 1234));
            System.out.println(Gym.this.name);
            System.out.println(name);
            date = new Date();
            System.out.println(date);
        }

        public Equipment(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }
}
