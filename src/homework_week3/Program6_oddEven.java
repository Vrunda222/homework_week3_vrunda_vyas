package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program6_oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking value from user
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        oddEven(number);
    }

    private static void oddEven(int number) {
        // checking number is odd or even using if else statement
        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

}
