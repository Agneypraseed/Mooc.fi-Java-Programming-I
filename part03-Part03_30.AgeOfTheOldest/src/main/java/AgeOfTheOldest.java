
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }
            String[] sp = s.split(",");
            if (Integer.valueOf(sp[1]) > a) {
                a = Integer.valueOf(sp[1]);
            }
        }
        System.out.println("Age of the oldest: " + a);
    }
}
