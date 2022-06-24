package siit.homework03;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryCatalog {
    public static void main(String[] args) {
        Book[] item = new Book[4];
        item[0] = new Novel("Dune", 798, "SF");
        item[1] = new Album("Michelangelo",65,"gloss");
        item[2] = new Novel("Shogun",564, "fiction");
        item[3] = new Album("Brancusi", 77, "mat");

        System.out.println(Arrays.toString(item));


    }
}
