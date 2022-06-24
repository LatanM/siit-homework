package siit.homework01;

import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = keyboard.nextInt();
        System.out.println("Is this number a palindrom?");
        System.out.println(is_Palindrome(n));
    }
    public static int reverse_nums(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }
    public static boolean is_Palindrome(int n) {
        return (n == reverse_nums(n));
    }
}
