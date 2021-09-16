
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account one = new Account("Matthews account", 1000);
        one.withdrawal(100);
        System.out.println(one);
        Account two = new Account("My account", 0);
        two.deposit(100);
        System.out.println(two);
    }
}
