
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s+= i;
        }
        System.out.println("The sum is " + s);
    }
}
