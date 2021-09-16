
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        double avg = 0;
        double grade = 0;
        int c = 0;
        int g = 0;
        int g5 = 0;
        int g4 = 0;
        int g3 = 0;
        int g2 = 0;
        int g1 = 0;
        int g0 = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            if (n >= 0 & n <= 100) {
                avg += n;
                c++;
            }
            if (n >= 50 & n <= 100) {
                grade += n;
                g++;
            }
            if (n >= 0 & n < 50) {
                g0++;
            }
            if (n >=50 & n < 60) {
                g1++;
            }
            if (n >=60 & n < 70) {
                g2++;
            }
            if (n >=70 & n < 80) {
                g3++;
            }
            if (n >=80 & n < 90) {
                g4++;
            }
            if (n >= 90 & n <= 100) {
                g5++;
            }

        }
        avg = avg / c;
        System.out.println("Point average (all): " + avg);
        if (g == 0) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } else {
            grade = grade / g;
            System.out.println("Point average (passing): " + grade);
            float p = (float) g / c;            
            System.out.println("Pass percentage: " + p * 100);
        }
        System.out.println("Grade distribution:");
                              
        System.out.print("5: ");
        while (g5 > 0) {
            System.out.print("*");
            g5--;
        }        

        System.out.println("");

        System.out.print("4: ");
        while (g4 > 0) {
            System.out.print("*");
            g4--;
        }

        System.out.println("");

        System.out.print("3: ");
        while (g3 > 0) {
            System.out.print("*");
            g3--;
        }

        System.out.println("");

        System.out.print("2: ");
        while (g2 > 0) {
            System.out.print("*");
            g2--;
        }

        System.out.println("");

        System.out.print("1: ");
        while (g1 > 0) {
            System.out.print("*");
            g1--;
        }

        System.out.println("");

        System.out.print("0: ");
        while (g0 > 0) {
            System.out.print("*");
            g0--;
        }

    }

}

