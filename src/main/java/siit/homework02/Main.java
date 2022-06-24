package siit.homework02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative[] reps = new SalesRepresentative[4];
        reps[0] = new SalesRepresentative(7 ,350, "Nick");
        reps[1] = new SalesRepresentative(15,700, "Michael");
        reps[2] = new SalesRepresentative(25,550, "Juta");
        reps[3] = new SalesRepresentative(30, 200, "Irine");

        System.out.println("Unsorted: " + Arrays.toString(reps));
        BubbleSort.sort(reps);
        System.out.println("Bubblesorted: " + Arrays.toString(reps));
    }
}
