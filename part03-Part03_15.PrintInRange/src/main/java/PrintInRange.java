
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        int l = s.nextInt();
        int u = s.nextInt();
        System.out.println("The numbers in the range [ " + l + ", " + u + " ]");
        printNumbersInRange(numbers, l, u);
        
    
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= upperLimit && numbers.get(i) >=lowerLimit) {
                System.out.println(numbers.get(i));
            }
        }
    }


}
