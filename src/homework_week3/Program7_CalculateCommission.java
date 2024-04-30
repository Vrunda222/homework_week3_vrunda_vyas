package homework_week3;

import java.util.Scanner;

public class Program7_CalculateCommission {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter sales id: ");
        int salesId = scn.nextInt();
        scn.skip("\\R?");
        System.out.print("Enter seller's name: ");
        String sellerName = scn.nextLine();
        System.out.print("Enter sales amount: ");
        int salesAmount = scn.nextInt();
        System.out.print("Enter salary basic: ");
        int basicSalary = scn.nextInt();
        scn.close();

        Program7_CalculateCommission obj = new Program7_CalculateCommission();
        obj.printPersonInfo(salesId, sellerName, salesAmount, basicSalary);
    }

    public void salesCommission(int salesAmount) {
        if (salesAmount >= 50000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.35));
        } else if (salesAmount >= 30000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.20));
        } else if (salesAmount >= 20000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.10));
        } else if (salesAmount >= 10000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.05));
        } else  {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.02));
        }
    }

    public void printPersonInfo(int salesId, String sellerName, int salesAmount, int basicSalary) {

        salesCommission(salesAmount);
    }
}


