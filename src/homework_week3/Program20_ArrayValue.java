package homework_week3;
/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Program20_ArrayValue {
    public static void arrayContainValue() {

        int num[] = {10, 20, 30, 40, 50};
        boolean result = false;
        int searchValue = 40;

        for (int x : num) {
            if (x == searchValue) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("The numbers array contains the value '" + searchValue + "'.");
        } else {
            System.out.println("The numbers array does not contain the value '" + searchValue + "'.");
        }
    }

    public static void main(String[] args) {
        arrayContainValue();
    }
}

