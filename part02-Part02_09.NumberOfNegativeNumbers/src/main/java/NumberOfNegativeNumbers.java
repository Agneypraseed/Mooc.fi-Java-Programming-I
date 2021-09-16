
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        while (true) {

            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                c += 1;
            }
        }

        System.out.println("Number of negative numbers: "+ c);
    }
}
