package homework_week3;

import java.util.Scanner;

public class Program10_MathsOperation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter number1: ");
        int num1 = scn.nextInt();
        System.out.print(" Enter number2: ");
        int num2 = scn.nextInt();
        System.out.print("Enter symbol (+, -, /, *): ");
        char symbol = scn.next().charAt(0);
        scn.close();

        cal(num1, num2, symbol);

    }

    public static void cal(int num1, int num2, char symbol) {
        if (symbol == '+') {
            System.out.println(num1+" + "+num2+" = " + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println(num1+" - "+num2+" = " + (num1 - num2));
        } else if (symbol == '*') {
            System.out.println(num1+" * "+num2+" = " + (num1 * num2));
        } else if (symbol == '/') {
            System.out.println(num1+" / "+num2+" = " + (num1 / num2));
        } else {
            System.out.println("Invalid entry");
        }
    }


}
