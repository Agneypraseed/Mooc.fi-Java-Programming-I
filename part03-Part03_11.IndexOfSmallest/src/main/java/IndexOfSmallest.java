
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int n = scanner.nextInt();
            if (n == 9999) {
                break;
            }
            list.add(n);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int s = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < s) {
                s = list.get(i);
            }
        }
        System.out.println("Smallest number: " + s);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == s) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
