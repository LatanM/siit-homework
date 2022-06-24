package siit.homework02;

public class BubbleSort {
    public static void sort(SalesRepresentative[] reps) {
        boolean changesPerformed = true;

        while(changesPerformed){
            changesPerformed = false;
            for(int i = 0; i < reps.length - 1; i++){
                if (reps[i].getRevenue() < reps[i+1].getRevenue()){
                    SalesRepresentative aux = reps[i];
                    reps[i] = reps[i+1];
                    reps[i+1] = aux;
                    changesPerformed = true;
                }
            }
        }
    }
}
