
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics one = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            one.addNumber(n);
            if (n % 2 == 0) {
                even.addNumber(n);
            } else {
                odd.addNumber(n);
            }
            
        }
        System.out.println("Sum: " + one.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}