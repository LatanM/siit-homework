package siit.homework03;

public class Album extends Book {
    String paperquality;

    public Album(String name, int noofpages, String paperquality){
        super(name, noofpages);
        this.paperquality = paperquality;
    }

    public String getPaperquality() {
        return paperquality;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + paperquality;
    }
}
