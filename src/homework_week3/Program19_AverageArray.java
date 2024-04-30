package homework_week3;
/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Program19_AverageArray {
    public static void main(String[] args) {

        int num[] = {10, 20, 30};
        int sum = 0;  //initialize sum

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        //calculate average value
        int avg = sum / num.length;
        System.out.println("Average value of the array elements is : " + avg);

    }
}
