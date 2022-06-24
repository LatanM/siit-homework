package siit.homework02;

public class SalesRepresentative {
    private final int sales;
    private final int quota;
    private final String name;

    public SalesRepresentative(int sales, int quota, String name) {
        this.sales = sales;
        this.quota = quota;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRevenue() {
        return sales * quota;
    }

    public String toString() {
        return name + " " + getRevenue();
    }

}
