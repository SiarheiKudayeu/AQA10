package lesson7.comporator;

public class ConsolesComparator {
    private Name name;

    public Name getName() {
        return name;
    }

    public ConsolesComparator(Name name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    private int cost;

    public enum Name {
        PLAYSTATION("Playstation"), NINTENDO("Nintendo"), XBOX("Xbox");
        private String name;

        public String getName() {
            return name;
        }

        Name(String name) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "ConsolesComparator{" +
                "name=" + name +
                ", cost=" + cost +
                '}';
    }

}


