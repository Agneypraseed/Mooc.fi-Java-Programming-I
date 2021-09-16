
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c=0;
        int s = 0;
        while (true) {

            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                c+=1;
                s+=n;
            }
        }
        System.out.println("Number of numbers: "+c);
        System.out.println("Sum of the numbers: "+s);
    }
}
