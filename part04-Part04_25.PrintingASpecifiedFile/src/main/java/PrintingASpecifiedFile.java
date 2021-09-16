
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed? ");
        try (Scanner s = new Scanner(Paths.get(scanner.nextLine()))) {

            // we read the file until all lines have been read
            while (s.hasNextLine()) {
                // we read one line
                String row = s.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}