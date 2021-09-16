
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int s = 0;
        int f = 0;
        while (true) {

            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else if (n > 0) {
                c += 1;
                s += n;
                f = 1;
            }
        }
        if (f != 0) {
            double avg = 1.0 * s / c;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
