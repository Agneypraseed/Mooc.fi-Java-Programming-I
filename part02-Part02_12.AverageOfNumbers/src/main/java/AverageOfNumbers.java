
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int s = 0;
        while (true) {

            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                c += 1;
                s += n;
            }
        }
        double avg = 1.0 * s / c;
        System.out.println("Average of the numbers: " + avg);
    }
}
