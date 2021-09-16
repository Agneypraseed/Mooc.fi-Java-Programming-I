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
    
    private TodoList l;
    private Scanner s;
    
    public UserInterface(TodoList l,Scanner s){
        this.l=l;
        this.s=s;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String cmd=s.nextLine();
            if(cmd.equals("stop")){
                break;
            }
            if(cmd.equals("add")){
                System.out.print("To add: ");
                String add=s.nextLine();
                l.add(add);
            }
            if(cmd.equals("list")){
                l.print();
            }
            if(cmd.equals("remove")){
                System.out.print("Which one is removed? ");
                int n=Integer.valueOf(s.nextLine());
                l.remove(n);
            }
            
            
        }
    }
    
    
    
    
    
    
}
