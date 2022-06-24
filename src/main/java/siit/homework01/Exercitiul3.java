package siit.homework01;

import java.util.Scanner;

public class Exercitiul3 {
    public static void main(String[] args) {
        int number, rest, maxdigit = 1;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = keyboard.nextInt();

        while (number > 0) {
            rest = number % 10;
            if (maxdigit < rest) {
                maxdigit = rest;
            }

            number = number / 10;
        }

        System.out.println("The max digit is:" + maxdigit);
    }

}
