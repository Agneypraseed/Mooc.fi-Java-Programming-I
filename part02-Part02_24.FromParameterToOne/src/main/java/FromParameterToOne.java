import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printFromNumberToOne(n);
    }
    public static void printFromNumberToOne(int n){
        while(n>0){
            System.out.println(n);
            n--;
        }
    }
}
