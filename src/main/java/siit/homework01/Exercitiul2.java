package siit.homework01;

public class Exercitiul2 {
    public static void main(String[] args) {
        int[] myarray = {23, 76, 3, 56, 78, 45, 1};
        int min = myarray[0];
        int i = 1;
        while (i < myarray.length) {
            if (min > myarray[i]) {
                min = myarray[i];
            }
            i++;
        }
        System.out.println("The smallest number from the array is " + min);
    }

}
