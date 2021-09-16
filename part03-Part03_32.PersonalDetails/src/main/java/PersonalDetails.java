
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yr=0;
        int c=0;
        String s="";
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {

                break;

            }

            String[] parts = input.split(",");
            c++;
            yr+=Integer.valueOf(parts[1]);
            if(parts[0].length()>s.length()){
                s=parts[0];
            }

        }
        System.out.println("Longest name: "+s);
        double avg=1.0*yr/c;
        System.out.println("Average of the birth years: "+avg);

    }
}
