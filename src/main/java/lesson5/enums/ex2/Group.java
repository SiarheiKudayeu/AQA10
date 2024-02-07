package lesson5.enums.ex2;

public enum Group {
    METALLICA("METALLICA", 4000), ACDC("AC/DC", 6000), QUEEN("QUEEN", 8000);

    Group(String name, int costOfTicket) {
        this.name = name;
        this.costOfTicket = costOfTicket;
    }

    private String name;
    private int costOfTicket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    public void setCostOfTicket(int costOfTicket) {
        this.costOfTicket = costOfTicket;
    }
}
