package siit.homework03;

public class Book {
    String name;
    int noofpages;

    public Book(String name, int noofpages){
        this.name = name;
        this.noofpages = noofpages;
    }

    public String getName() {
        return name;
    }

    public int getNoofpages() {
        return noofpages;
    }

    @Override
    public String toString() {
        return name + "(" + noofpages + " " + "pages" + ")";
    }
}
