package homework_week3;

public class Program11_PrintNumber {

    public static void main(String[] args) {
          divisibleByThreeAndFive();
    }

    public static void divisibleByThreeAndFive() {
        System.out.println("Divisible by 3\t\t Divisible by 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("\t" + i);
            }
            if (i % 5 == 0) {
                System.out.println("\t\t\t\t\t\t" + i);
            }
        }
    }



}
