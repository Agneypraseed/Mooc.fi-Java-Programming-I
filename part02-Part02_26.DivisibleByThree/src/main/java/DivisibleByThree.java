
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int e = scanner.nextInt();
        divisibleByThreeInRange(b, e);
    }

    public static void divisibleByThreeInRange(int b, int e) {
        for (int i = b; i <= e; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}