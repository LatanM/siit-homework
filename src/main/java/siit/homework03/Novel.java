package siit.homework03;

public class Novel extends Book {
    String type;

    public Novel(String name, int noofpages, String type){
        super(name, noofpages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + type;
    }
}
