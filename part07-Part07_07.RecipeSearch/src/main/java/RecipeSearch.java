
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        System.out.println("");

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")) {
                break;
            }

            if (cmd.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                try (Scanner s = new Scanner(Paths.get(file))) {
                    String food = s.nextLine();
                    String time = s.nextLine();
                    while (s.hasNextLine()) {
                        System.out.print(food);
                        System.out.print(", cooking time: ");
                        System.out.print(time);
                        System.out.print(".");
                        System.out.println("");
                        while (!food.isEmpty() & s.hasNextLine()) {
                            food = s.nextLine();
                        }
                        if (!s.hasNextLine()) {
                            break;
                        } else {
                            food = s.nextLine();
                            time = s.nextLine();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (cmd.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("");

                System.out.println("Recipes:");

                try (Scanner s = new Scanner(Paths.get(file))) {
                    while (s.hasNextLine()) {
                        String food = s.nextLine();
                        if (food.contains(word)) {
                            System.out.print(food);
                            System.out.print(", cooking time: ");
                            String time = s.nextLine();
                            System.out.print(time);
                            System.out.print(".");
                            System.out.println("");
                        }
                        while (!food.isEmpty() & s.hasNextLine()) {
                            food = s.nextLine();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            }

            if (cmd.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int t = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");

                try (Scanner s = new Scanner(Paths.get(file))) {
                    while (s.hasNextLine()) {
                        String food = s.nextLine();
                        int time = Integer.valueOf(s.nextLine());
                        if (time <= t) {
                            System.out.print(food);
                            System.out.print(", cooking time: ");
                            System.out.print(time);
                            System.out.print(".");
                            System.out.println("");
                        }
                        while (!food.isEmpty() & s.hasNextLine()) {
                            food = s.nextLine();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (cmd.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ing = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");

                try (Scanner s = new Scanner(Paths.get(file))) {
                    String food = s.nextLine();

                    String time = s.nextLine();

                    String ig = s.nextLine();
                    
                    while (s.hasNextLine()) {

                        while (true) {
                            if (ig.equals(ing)) {
                                System.out.print(food);
                                System.out.print(", cooking time: ");
                                System.out.print(time);
                                System.out.print(".");
                                System.out.println("");
                                break;
                            }
                            if (s.hasNextLine()) {
                                String next = s.nextLine();
                                if (next.isEmpty()) {
                                    break;
                                }
                                ig = next;
                            } else {
                                break;
                            }
                        }                        
                        if (!s.hasNextLine()) {
                            break;
                        } else {
                            food = s.nextLine();
                            time = s.nextLine();
                            ig=s.nextLine();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            }

        }

    }
}
