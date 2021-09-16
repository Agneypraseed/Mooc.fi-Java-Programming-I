
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> db = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String cmd = scan.nextLine();

            if (cmd.equals("Quit")) {
                break;
            }

            if (cmd.equals("Add")) {
                System.out.print("Name: ");
                String n = scan.nextLine();
                System.out.print("Name in Latin: ");
                String l = scan.nextLine();
                Bird b = new Bird(n, l);
                db.add(b);
            }

            if (cmd.equals("Observation")) {
                System.out.print("Bird? ");
                String n = scan.nextLine();
                int f = 0;
                for (Bird b : db) {
                    if (b.check(n)) {
                        b.add();
                        f++;
                    }
                }
                if (f == 0) {
                    System.out.println("Not a bird!");
                }
            }

            if (cmd.equals("All")) {
                for (Bird b : db) {
                    System.out.println(b.toString());
                }
            }

            if (cmd.equals("One")) {
                System.out.print("Bird? ");
                String n = scan.nextLine();
                for (Bird b : db) {
                    if (b.check(n)) {
                        System.out.println(b.toString());
                    }
                }
            }
        }
    }

}
