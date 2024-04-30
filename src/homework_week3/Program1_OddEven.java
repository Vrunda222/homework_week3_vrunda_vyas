package homework_week3;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Program1_OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking value from user
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        oddEven(number);
        sc.close();
    }

    // creating static method
    public static void oddEven(int number) {
        // checking number is odd or even
        String ans = number % 2 == 0 ? "even" : "odd";
        System.out.println(ans);
    }

}
