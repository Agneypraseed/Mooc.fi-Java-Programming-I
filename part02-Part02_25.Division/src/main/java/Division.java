import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"'
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        division(n,d);
        // division(3, 5);
    }

    // implement the method here
    public static void division(int n,int d){
        double r=1.0*n/d;
        System.out.println(r);
    }
}
