
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int w = 0;
        int l = 0;
        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                String parts[] = s.nextLine().split(",");
                if (parts[0].equals(team)) {
                    games++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        w++;
                    }
                    else{
                        l++;
                    }
                } else if(parts[1].equals(team)) {
                    games++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        l++;
                    }else{
                        w++;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: "+w);
        System.out.println("Losses: "+l);
    }

}
