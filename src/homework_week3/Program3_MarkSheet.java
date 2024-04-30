package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 and 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * __________________________________
 * |                                |
 * |           Mark Sheet           |
 * |________________________________|
 * |      Name        : Jay         |
 * |      Roll No     : 08          |
 * |________________________________|
 * |      Subjects    : Marks       |
 * |________________________________|
 * |      Math        : 98          |
 * |      Science     : 90          |
 * |      English     : 85          |
 * |________________________________|
 * |      Total       : 273         |
 * |________________________________|
 * |      Percentage  : 91.0        |
 * |      Result      : Pass        |
 * |      Grade       : A+          |
 * |________________________________|
 */
public class Program3_MarkSheet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scn.nextLine();

        System.out.println("Enter your two digit roll number: ");
        int rollNumber = scn.nextInt();

        System.out.println("Enter your marks of a subject maths: ");
        int marksOfMaths = scn.nextInt();

        while (marksOfMaths < 0 || marksOfMaths > 100) {
            System.out.println("Sorry marks for maths is not a valid mark");
            System.out.print("Please enter valid marks for Maths:");
            //Scanner sc = new Scanner(System.in);
            marksOfMaths = scn.nextInt();
        }


        System.out.println("Enter your marks of a subject science: ");
        int marksOfScience = scn.nextInt();

        while (marksOfScience < 0 || marksOfScience > 100) {
            System.out.println("Sorry marks for science is not a valid mark");
            System.out.print("Please enter valid marks for science:");
            //Scanner sc = new Scanner(System.in);
            marksOfScience = scn.nextInt();
        }

        System.out.println("Enter your marks of a subject english: ");
        int marksOfEnglish = scn.nextInt();

        while (marksOfEnglish < 0 || marksOfEnglish > 100) {
            System.out.println("Sorry marks for english is not a valid mark");
            System.out.print("Please enter valid marks for english:");
            //Scanner sc = new Scanner(System.in);
            marksOfEnglish = scn.nextInt();
        }


        markSheet(name, rollNumber, marksOfMaths, marksOfScience, marksOfEnglish);
    }

    public static void markSheet(String name, int rollNumber, int marksOfMaths, int marksOfScience, int marksOfEnglish) {

        /**    while (marksOfMaths < 0 || marksOfMaths > 100) {
         System.out.println("Sorry marks for maths is not a valid marks");
         System.out.print("Please enter valid marks for maths:");
         Scanner sc = new Scanner(System.in);
         marksOfMaths = sc.nextInt();
         }
         /**
         * I know this is wrong;
         * but I don't know how to call main method scanner object in this method
         * is it possible?
         *
         * I am confused where to put while loop?
         */
        int totalOfMarks = marksOfMaths + marksOfEnglish + marksOfScience;
        double percentage = (double) totalOfMarks / 3;


        System.out.println("__________________________________");
        System.out.println("|                                |");
        System.out.println("|             Mark Sheet         |");
        System.out.println("|________________________________|");
        System.out.println("|      Name        : " + name + "         |");
        System.out.println("|      Roll No     : " + rollNumber + "          |");
        System.out.println("|________________________________|");
        System.out.println("|      Subjects    : Marks       |");
        System.out.println("|________________________________|");
        System.out.println("|      Math        : " + marksOfMaths + "          |");
        System.out.println("|      Science     : " + marksOfScience + "          |");
        System.out.println("|      English     : " + marksOfEnglish + "          |");
        System.out.println("|________________________________|");
        System.out.println("|      Total       : " + totalOfMarks + "         |");
        System.out.println("|________________________________|");
        System.out.println("|      Percentage  : " + percentage + "        |");
        // print Pass or Fail
        if (percentage >= 35) {
            System.out.println("|      Result      : PASS        |");
        } else {
            System.out.println("|      Result      : FAIL        |");
        }
        // print Grade
        if (percentage <= 100 && percentage >= 80) {
            System.out.println("|      Grade       : A+          |");
        } else if (percentage <= 79 && percentage >= 60) {
            System.out.println("|      Grade       : A          |");
        } else if (percentage <= 59 && percentage >= 50) {
            System.out.println("|      Grade       : B          |");
        } else {
            System.out.println("|      Grade       : C          |");
        }

        System.out.println("|________________________________|");
    }
}
