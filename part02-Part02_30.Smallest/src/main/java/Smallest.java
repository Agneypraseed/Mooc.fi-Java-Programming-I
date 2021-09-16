
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        int s;
        if (number1 > number2) {
            s = number2;
        } else {
            s = number1;
        }
        return s;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
