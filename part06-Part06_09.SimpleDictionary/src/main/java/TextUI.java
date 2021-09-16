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

public class TextUI {
    
    private SimpleDictionary d;
    private Scanner scanner;
    
    public TextUI(Scanner scanner,SimpleDictionary d){
        this.d=d;
        this.scanner=scanner;
    }
    
    public void start(){
        while(true){
        System.out.print("Command: ");
        String cmd=scanner.nextLine();
        if(cmd.equals("end")){
            System.out.println("Bye bye!");
            break;
        }
        else if(cmd.equals("add")){
            System.out.print("Word: ");
            String word=scanner.nextLine();
            System.out.print("Translation: ");
            String trans=scanner.nextLine();
            this.d.add(word, trans);
        }
        else if(cmd.equals("search")){
            System.out.print("To be translated: ");
            String word=scanner.nextLine();
            String t=this.d.translate(word);
            if(t==null){
                System.out.println("Word "+word+" was not found");
            }else{
                System.out.println(t);
            }
        }
        else{
            System.out.println("Unknown command");
        }
        }
    }
    
    
}
