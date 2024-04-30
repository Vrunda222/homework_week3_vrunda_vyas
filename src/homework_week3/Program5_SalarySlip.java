package homework_week3;

import java.util.Scanner;

public class Program5_SalarySlip {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int empId = scn.nextInt();
        scn.skip("\\R?");
        System.out.print("Enter Employee Name: ");
        String empName = scn.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scn.nextDouble();
        scn.close();
        Program5_SalarySlip obj = new Program5_SalarySlip();
        obj.printSalarySlip(empId, empName, basicSalary);

    }

    public void printSalarySlip(int empId, String empName, double basicSalary) {

        double hra = basicSalary * 10 / 100;
        double da = basicSalary * 8 / 100;
        double ta = basicSalary * 9 / 100;
        double pf = basicSalary * 20 / 100;
        double grossSal = basicSalary + hra + da + ta - pf;

        System.out.println(" _______________________________");
        System.out.println("|             Salary Slip       |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id         :" + empId + "     |");
        System.out.println("| Employee Name       :" + empName + "      |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary        :" + basicSalary + "  |");
        System.out.println("| HRA 10%             :" + hra + "   |");
        System.out.println("| TA 8%               :" + ta + "   |");
        System.out.println("| DA 9%               :" + da + "   |");
        System.out.println("| PF - 20&            :" + pf + "   |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary        :" + grossSal + "  |");
        System.out.println("|===============================|");

    }
}
