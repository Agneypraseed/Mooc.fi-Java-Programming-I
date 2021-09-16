
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        books.add(new Book(515172,"name 515172"));
        books.add(new Book(649566,"name 649566"));
        books.add(new Book(681903,"name 681903"));
        books.add(new Book(761873,"name 761873"));
        books.add(new Book(785366,"name 785366"));
        
        

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int l = -1;
        for (int i=0;i<books.size();i++) {            
            Book b=books.get(i);
            if (b.getId()==searchedId) {
                l = i;
                break;
            }
        }
        return l;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int l = -1;
        int b = 0;
        int e = books.size() - 1;
        while (e >= b) {
            int m = (b + e) / 2;            
            Book c=books.get(m);            
            if (c.getId()==searchedId) {
                l=m;
                break;
            }else if(c.getId()>searchedId){
                e=m-1;
            }else{
                b=m+1;
            }
        }        
        return l;
    }

}
