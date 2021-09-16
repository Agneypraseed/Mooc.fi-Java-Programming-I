
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int abs;
        if (n < 0) {
            abs = n * -1;
        } else {
            abs = n;
        }
        System.out.println(abs);
    }
}
