
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int c = 0;
        int e = 0;
        int o = 0;
        while (true) {
            System.out.println("Give numbers:");
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            s += n;
            c += 1;
            if (n % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + s);
        System.out.println("Numbers: " + c);
        double avg = 1.0 * s / c;
        System.out.println("Average: " + avg);
        System.out.println("Even: " + e);
        System.out.println("Odd: " + o);
    }
}
