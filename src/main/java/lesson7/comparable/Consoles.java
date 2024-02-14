package lesson7.comparable;

public class Consoles implements Comparable<Consoles> {
    private Name name;

    public Name getName() {
        return name;
    }

    public Consoles(Name name, int cost) {
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

    /*    @Override
        public int compareTo(ConsolesComparator o){
            if(this.cost > o.cost){
                return -1;
            }else if(this.cost < o.cost) {
                return 1;
            } else {
                return 0;
            }
        }*/
/*    @Override
    public int compareTo(ConsolesComparator o) {
        return o.cost - this.cost;
    }*/

    @Override
    public int compareTo(Consoles o) {
        return this.name.getName().compareTo(o.name.getName());
    }

}


