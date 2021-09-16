
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }
            String[] sp=s.split(" ");
            for(int i=0;i<sp.length;i++){
                System.out.println(sp[i]);
            }
        }
    }
}
