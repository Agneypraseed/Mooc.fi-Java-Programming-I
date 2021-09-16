
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books=new ArrayList<>();
        Scanner s = new Scanner(System.in);
// implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String name = s.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(s.nextLine());
            System.out.print("Publication year: ");
            int yr = Integer.valueOf(s.nextLine());
            books.add(new Book(name,pages,yr));
        }
        System.out.print("What information will be printed? ");
        String a=s.nextLine();
        for(Book b:books){
            System.out.println(b.print(a));
        }
        
    }
}
