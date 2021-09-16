
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = 0;
        int s = 0;
        while (true) {
            System.out.println("First: " + f + "/100");
            System.out.println("Second: " + s + "/100");

            
            System.out.print("> ");
            
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String cmd = parts[0];
            int amt = Integer.valueOf(parts[1]);

            if (cmd.equals("add")) {
                if(amt<0){
                    continue;
                }
                if (f + amt <= 100) {
                    f += amt;
                } else {
                    f = 100;
                }
            }

            if (cmd.equals("move")) {
                if (amt < 0) {
                    continue;
                }
                if (amt <= f) {
                    s += amt;
                    f -= amt;
                    if (s > 100) {
                        s = 100;
                    }
                } else {
                    s += f;
                    f = 0;
                    if (s > 100) {
                        s = 100;
                    }
                }
            }

            if (cmd.equals("remove")) {
                if (s == 0| amt<0) {
                    continue;
                } else if (s - amt < 0) {
                    s = 0;
                } else {
                    s -= amt;
                }

            }

        }
    }

}
