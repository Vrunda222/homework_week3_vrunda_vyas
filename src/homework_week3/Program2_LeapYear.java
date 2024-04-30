package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program2_LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // taking value from user
        System.out.println("Enter any year:");
        //creating object to call instance method
        Program2_LeapYear obj = new Program2_LeapYear();
        //passing user's value in instance method with the use of object
        obj.leapYear(scn.nextInt());
        scn.close();
    }
    public void leapYear(int year){
        if(year % 4 == 0){
            System.out.println(year +" is a leap year.");
        }
        else{
            System.out.println(year +" is not a leap year.");
        }
    }
}
