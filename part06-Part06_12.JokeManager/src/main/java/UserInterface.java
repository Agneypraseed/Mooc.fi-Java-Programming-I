/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager j;
    private Scanner scanner;

    public UserInterface(JokeManager j, Scanner s) {
        this.j = j;
        this.scanner = s;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            String s=scanner.nextLine();
            if(s.equals("X")){
                break;
            }
            int cmd=Integer.valueOf(s);
            if(cmd==1){
                System.out.println("Write the joke to be added:");
                this.j.addJoke(scanner.nextLine());
            }
            if(cmd==2){
                System.out.println(this.j.drawJoke());
            }
            if(cmd==3){
                System.out.println("Printing the jokes.");
                this.j.printJokes();
            }
            
        }
    }

}
