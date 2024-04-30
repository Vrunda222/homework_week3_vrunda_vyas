package homework_week3;
/**
 * 18. Write a Java program to sum values of an array.
 */
public class Program18_ArraySum {
    public static int sumOfArrayElements() {
        int num[] = {10, 20, 30, 40};
        int sum = 0;  //initialize sum
        int i;
        for (i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of given array: " + sumOfArrayElements());
    }

}
