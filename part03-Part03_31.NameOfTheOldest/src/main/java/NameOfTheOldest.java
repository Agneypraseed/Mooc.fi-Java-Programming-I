
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        String name="";
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }
            String[] sp = s.split(",");
            if (Integer.valueOf(sp[1]) > a) {
                a = Integer.valueOf(sp[1]);
                name+=sp[0];
            }
        }
        System.out.println("Name of the oldest: "+name);
    }
}
