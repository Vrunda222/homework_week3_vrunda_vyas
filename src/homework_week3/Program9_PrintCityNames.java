package homework_week3;

import java.util.Scanner;

public class Program9_PrintCityNames {
    public static void main(String[] args) {
        String cityName;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any alphabet from 'A' to 'F': ");
        char alphabet = scn.next().toUpperCase().charAt(0);
        scn.close();

        switch (alphabet) {
            case 'A':
                cityName = "Arlington";
                break;
            case 'B':
                cityName = "Birmingham";
                break;
            case 'C':
                cityName = "Coventry";
                break;
            case 'D':
                cityName = "Durham";
                break;
            case 'E':
                cityName = "Edinburgh";
                break;
            case 'F':
                cityName = "Florida Ridge";
                break;
            default:
                cityName = "Invalid entry";
                break;
        }
        System.out.println("City Name: " +cityName);
    }
}
